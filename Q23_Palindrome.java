import java.util.Scanner;

class Palindrome {
    int number;

    void check() {
        int original = number;
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (original == reverse)
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
    }
}

public class Q23_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Palindrome obj = new Palindrome();

        System.out.print("Enter an integer: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}