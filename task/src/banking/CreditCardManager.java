package banking;

public class CreditCardManager {
    private GenerateNumbers generateNumbers;

    public CreditCardManager() {
        generateNumbers = new GenerateNumbers();
    }

    private String generatePIN() {
        return generateNumbers.generate(4);
    }

    private int luhnAlgorithm(StringBuilder cardNumber) {
        int sum = 0;
        for (int i = 0; i < cardNumber.length(); i++) {
            int tempDigit =  Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
            if (i % 2 == 0) {
                tempDigit *= 2;
            }
            if (tempDigit > 9) {
                tempDigit -= 9;
            }
            sum += tempDigit;
        }
        return sum;
    }

    public boolean checkCreditCardNumberByLuhnAlgorithm(StringBuilder cardNumber) {
        if (luhnAlgorithm(cardNumber) % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private String generateCardNumberByLuhnAlgorithm() {
        StringBuilder generateCardNumber = new StringBuilder("400000" + generateNumbers.generate(9));
        int lastDigit = (100 - luhnAlgorithm(generateCardNumber)) % 10;
        return String.valueOf(generateCardNumber.append(lastDigit));
    }

    public CreditCard getNewCreditCard() {
        return new CreditCard(generateCardNumberByLuhnAlgorithm(), generatePIN());
    }
}
