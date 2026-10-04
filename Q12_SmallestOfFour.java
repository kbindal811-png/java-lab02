import java.util.Scanner;

class SmallestNumber {
    int a, b, c, d;

    void findSmallest() {
        int smallest = (a < b) ?
                       ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d)) :
                       ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("Smallest number: " + smallest);
    }
}

public class Q12_SmallestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SmallestNumber obj = new SmallestNumber();

        System.out.print("Enter four numbers: ");
        obj.a = sc.nextInt();
        obj.b = sc.nextInt();
        obj.c = sc.nextInt();
        obj.d = sc.nextInt();

        obj.findSmallest();

        sc.close();
    }
}