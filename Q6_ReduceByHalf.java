import java.util.Scanner;

class NumberReduction {
    double number;
    int steps;

    void calculate() {
        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Number of steps: " + steps);
        System.out.println("Final value: " + number);
    }
}

public class Q6_ReduceByHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberReduction obj = new NumberReduction();

        System.out.print("Enter a number: ");
        obj.number = sc.nextDouble();

        obj.calculate();

        sc.close();
    }
}