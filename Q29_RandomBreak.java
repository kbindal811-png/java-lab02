import java.util.Random;

class RandomNumbers {
    void generate() {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(100) + 1;

            System.out.println("Generated number: " + number);

            if (number % 7 == 0 && number % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13 found.");
                break;
            }
        }
    }
}

public class Q29_RandomBreak {
    public static void main(String[] args) {
        RandomNumbers obj = new RandomNumbers();

        obj.generate();
    }
}