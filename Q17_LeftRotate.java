import java.util.Scanner;

class BitRotation {
    int number;

    void rotate() {
        int result = (number << 2) | (number >>> 30);

        System.out.println("Original number: " + number);
        System.out.println("After left rotation by 2 bits: " + result);
    }
}

public class Q17_LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BitRotation obj = new BitRotation();

        System.out.print("Enter an integer: ");
        obj.number = sc.nextInt();

        obj.rotate();

        sc.close();
    }
}