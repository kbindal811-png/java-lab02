import java.util.Scanner;

class MixedOperations {
    int number;

    boolean isPowerOfFour() {
        if (number <= 0)
            return false;

        int temp = number;

        while (temp > 1) {
            if ((temp & 3) != 0)
                return false;

            temp = temp >> 2;
        }

        return true;
    }

    void process() {
        if (isPowerOfFour())
            System.out.println(number + " is a power of 4.");
        else {
            System.out.println(number + " is not a power of 4.");
            return;
        }

        int toggled = number ^ (1 << 2);

        System.out.println("Original number: " + number);
        System.out.println("After toggling 3rd bit: " + toggled);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {
            int result = number * i;

            if (result % 6 == 0)
                continue;

            if (result % 48 == 0)
                break;

            System.out.println(number + " x " + i + " = " + result);
        }
    }
}

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MixedOperations obj = new MixedOperations();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.process();

        sc.close();
    }
}