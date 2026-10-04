import java.util.Scanner;

class SwapNumbers {
    int a, b;

    void swap() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}

public class Q14_XORSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SwapNumbers obj = new SwapNumbers();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.swap();

        sc.close();
    }
}
