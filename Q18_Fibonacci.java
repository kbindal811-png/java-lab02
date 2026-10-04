import java.util.Scanner;

class Fibonacci {
    int terms;

    void generate() {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class Q18_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fibonacci obj = new Fibonacci();
        obj.terms = 20;

        System.out.println("First 20 Fibonacci terms:");
        obj.generate();

        sc.close();
    }
}