import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String AccountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    public void createAccount (){
        System.out.println("Wprowadz nazwę konta");
        name = scanner.next();
        System.out.println("Wprowadz numer konta");
        AccountNumber = scanner.next();
        System.out.println("Wprowadz login");
        login = scanner.next();
        System.out.println("Wprowadz ilośc środków na koncie");
        balance = scanner.nextLong();

    }


    public void showAccount(){
        System.out.println("Twoja nazwa konta to "+name);
        System.out.println("Twój numer konta to " +AccountNumber);
        System.out.println("Twój login to " +login);
        System.out.println("Ilość środków dostępnych na koncie "+balance);
    }
    public void deposit(){
        System.out.println("Podaj kwotę wpłaty");
        long pieniadze;
        pieniadze = scanner.nextLong();
        balance = pieniadze + balance;
    }




    public void withdrawal() {
        System.out.println("Podaj kwote wyplaty");
        long kwotaWyplaty;
        kwotaWyplaty = scanner.nextLong();
        if (balance < kwotaWyplaty) {
            System.out.println("brak wystarczajacych srodkow");
        } else {
            balance = balance - kwotaWyplaty;
        }
    }
        public long getBalance() {
            return balance;

    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


}
