package banking;

import java.sql.*;

public class DataBaseManager {
    private String URL = "jdbc:sqlite:";
    private Connection connection;
    private DatabaseMetaData meta;
    private PreparedStatement preparedStatement;
    private CreditCardManager creditCardManager;
    private String query;

    public DataBaseManager(String DataBaseName) {
        creditCardManager = new CreditCardManager();
        try {
            connection = DriverManager.getConnection(URL+DataBaseName);
            meta = connection.getMetaData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        initialize();
    }

    private void initialize() {
        query = "CREATE TABLE IF NOT EXISTS card(id INTEGER PRIMARY KEY, number TEXT, pin TEXT, balance INTEGER DEFAULT 0);";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addCreditCard() throws SQLException {
        CreditCard creditCard;
        ResultSet resultSet;

        do {
            creditCard = creditCardManager.getNewCreditCard();
            query = "SELECT * FROM card WHERE number = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, creditCard.getCreditCardNumber());
            resultSet = preparedStatement.executeQuery();
        }while (resultSet.next());

        query = "INSERT INTO card(number, pin) VALUES(?,?) ";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, creditCard.getCreditCardNumber());
        preparedStatement.setString(2, creditCard.getPIN());
        preparedStatement.executeUpdate();
        System.out.println("Your card has been created\nYour card number:\n"+creditCard.getCreditCardNumber()+"\nYour card PIN:\n"+creditCard.getPIN());
    }

    public void ending() throws SQLException {
        preparedStatement.close();
        connection.close();
    }

    public void addIncome(int income, String cardNumber) throws SQLException {
        query = "UPDATE card SET balance = balance + ? WHERE number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, String.valueOf(income));
        preparedStatement.setString(2, cardNumber);
        preparedStatement.executeUpdate();
        System.out.println("Income was added!");
    }

    public void balance(String cardNumber) throws SQLException {
        query = "SELECT * FROM card WHERE number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, cardNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int balance = resultSet.getInt("balance");
        System.out.println("Balance: "+balance);
    }

    public String transferMoneyChecks(String cardNumberOwner,String cardNumberDestination) throws SQLException {
        String result = "";
        if (cardNumberOwner.equals(cardNumberDestination)) {
            result = "You can't transfer money to the same account!";
        } else {
            boolean validityCreditCard = creditCardManager.checkCreditCardNumberByLuhnAlgorithm(new StringBuilder(cardNumberDestination));
            if (validityCreditCard) {
                query = "SELECT * FROM card WHERE number = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, cardNumberDestination);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    result = "ok";
                } else {
                    result = "Such a card does not exist.";
                }
            } else {
                result = "Probably you made mistake in the card number. Please try again!";
            }
        }
        return result;
    }

    public void transferMoney(String cardNumberOwner,String cardNumberDestination, int quantity) throws SQLException {
            query = "SELECT * FROM card WHERE number = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cardNumberOwner);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int balance = resultSet.getInt("balance");
            if (quantity > balance) {
                System.out.println("Not enough money!");
            } else {
                query = "UPDATE card SET balance = balance + ? WHERE number = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, quantity);
                preparedStatement.setString(2, cardNumberDestination);
                preparedStatement.executeUpdate();

                query = "UPDATE card SET balance = balance - ? WHERE number = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, quantity);
                preparedStatement.setString(2, cardNumberOwner);
                preparedStatement.executeUpdate();
                System.out.println("Success!");
            }
    }

    public void closeAccount (String cardNumber) throws SQLException {
        query = "DELETE FROM card WHERE number = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, cardNumber);
        preparedStatement.executeUpdate();
        System.out.println("The account has been closed!");
    }

    public boolean logVerification(String cardNumber, String cardPin) throws SQLException {
        String query = "SELECT * FROM card WHERE number = ? AND pin = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, cardNumber);
        preparedStatement.setString(2, cardPin);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}
