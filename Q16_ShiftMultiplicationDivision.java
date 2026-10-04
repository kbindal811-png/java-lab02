import java.util.Scanner;

class ShiftOperation {
    int number, power;

    void calculate() {
        int multiplied = number << power;
        int divided = number >> power;

        System.out.println("After multiplication by 2^" + power + ": " + multiplied);
        System.out.println("After division by 2^" + power + ": " + divided);
    }
}

public class Q16_ShiftMultiplicationDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShiftOperation obj = new ShiftOperation();

        System.out.print("Enter number: ");
        obj.number = sc.nextInt();

        System.out.print("Enter power: ");
        obj.power = sc.nextInt();

        obj.calculate();

        sc.close();
    }
}