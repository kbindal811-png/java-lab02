import java.util.Scanner;

class ReverseNumber {
    int number;

    void reverse() {
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}

public class Q22_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ReverseNumber obj = new ReverseNumber();

        System.out.print("Enter an integer: ");
        obj.number = sc.nextInt();

        obj.reverse();

        sc.close();
    }
}