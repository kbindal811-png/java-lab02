import java.util.Scanner;

class BitCounter {
    int number;

    void countBits() {
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count += temp & 1;
            temp = temp >>> 1;
        }

        System.out.println("Number of set bits: " + count);
    }
}

public class Q15_SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BitCounter obj = new BitCounter();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.countBits();

        sc.close();
    }
}