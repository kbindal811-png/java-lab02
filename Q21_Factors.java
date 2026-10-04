import java.util.Scanner;

class Factors {
    int number;

    void display() {
        int i = 1;

        System.out.println("Factors of " + number + ":");

        do {
            if (number % i == 0)
                System.out.print(i + " ");

            i++;
        } while (i <= number);
    }
}

public class Q21_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Factors obj = new Factors();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.display();

        sc.close();
    }
}