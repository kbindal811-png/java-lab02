import java.util.Scanner;

class NegativeNumber {
    int number;

    void calculate() {
        int negative = -number;
        System.out.println("Negative value: " + negative);
    }
}

public class Q5_NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NegativeNumber obj = new NegativeNumber();

        System.out.print("Enter an integer: ");
        obj.number = sc.nextInt();

        obj.calculate();

        sc.close();
    }
}