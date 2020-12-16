package banking;

import java.util.Random;

public class GenerateNumbers {
    private StringBuilder randomNumbers = new StringBuilder();
    private int size;
    private Random random = new Random();

    public String generate(int size) {
        this.size = size;
        randomNumbers.setLength(0);
        for (int i = 0; i < size; i++) {
            randomNumbers.append(random.nextInt(10));
        }
        return String.valueOf(randomNumbers);
    }
}
