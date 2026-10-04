import java.util.Scanner;

class ArrayValues {
    int[] numbers;

    void findValues() {
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max)
                max = number;

            if (number < min)
                min = number;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

public class Q24_MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayValues obj = new ArrayValues();
        obj.numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            obj.numbers[i] = sc.nextInt();
        }

        obj.findValues();

        sc.close();
    }
}