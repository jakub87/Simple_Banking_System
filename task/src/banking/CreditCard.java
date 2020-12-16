package banking;

public class CreditCard {
    private String creditCardNumber;
    private String PIN;

    public CreditCard(String creditCardNumber, String PIN) {
        this.creditCardNumber = creditCardNumber;
        this.PIN = PIN;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getPIN() {
        return PIN;
    }
}
