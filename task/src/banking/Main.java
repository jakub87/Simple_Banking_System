package banking;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        String DBName = args[1];
        DataBaseManager dataBaseManager = new DataBaseManager(DBName);
        Scanner scanner = new Scanner(System.in);
        int mainMenuSelect;
        do {
            Menu.main();
            mainMenuSelect = Integer.parseInt(scanner.nextLine());
            if (mainMenuSelect == 1) {
                dataBaseManager.addCreditCard();
            } else if (mainMenuSelect == 2) {
                System.out.println("Enter your card number:");
                String cardNumber = scanner.nextLine();
                System.out.println("Enter your PIN:");
                String pin = scanner.nextLine();
                if (dataBaseManager.logVerification(cardNumber,pin)) {
                    System.out.println("You have successfully logged in!");
                    boolean logged = true;
                    do {
                        Menu.logged();
                        int userSelect = Integer.parseInt(scanner.nextLine());
                        if (userSelect == 1) {
                            dataBaseManager.balance(cardNumber);
                        } else if (userSelect == 2) {
                            System.out.println("Enter income:");
                            int income = Integer.parseInt(scanner.nextLine());
                            dataBaseManager.addIncome(income, cardNumber);
                        } else if (userSelect == 3) {
                            System.out.println("Transfer");
                            System.out.println("Enter card number:");
                            String cardNumberDestination = scanner.nextLine();
                            String cardNumberVerification = dataBaseManager.transferMoneyChecks(cardNumber, cardNumberDestination);
                            if (cardNumberVerification.equals("ok")) {
                                System.out.println("Enter how much money you want to transfer:");
                                int quantity = Integer.parseInt(scanner.nextLine());
                                dataBaseManager.transferMoney(cardNumber, cardNumberDestination, quantity);
                            } else {
                                System.out.println(cardNumberVerification);
                            }
                        } else if (userSelect == 4) {
                            dataBaseManager.closeAccount(cardNumber);
                            logged = false;
                        } else if (userSelect == 5) {
                            logged = false;
                            System.out.println("You have successfully logged out!");
                        } else if (userSelect == 0) {
                            logged = false;
                            mainMenuSelect = 0;
                        }
                    } while (logged);
                } else {
                    System.out.println("Wrong card number or PIN!");
                }
            }
        }while(mainMenuSelect != 0);
        System.out.println("Bye!");
        dataBaseManager.ending();
    }
}