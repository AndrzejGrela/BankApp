import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Witaj w aplikacji bankowej");
        account.createAccount();
        int inputNumber;
        do {
            System.out.println("Podaj polecenie \n 1. Pokaz informacje o koncie \n 2. Wplacanie gotowki \n 3. wyplata gotowki \n 4. wyjscie");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    account.showAccount();
                    break;
                case 2:
                    account.deposit();
                    break;
                case 3:
                    account.withdrawal();
                    break;
            }
        } while (inputNumber != 4);

    }
}
