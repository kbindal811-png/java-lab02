import java.util.Scanner;

class TriangleAngles {
    int a, b, c;

    void check() {
        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("The angles form a valid triangle.");
        else
            System.out.println("The angles do not form a valid triangle.");
    }
}

public class Q8_ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleAngles obj = new TriangleAngles();

        System.out.print("Enter angle 1: ");
        obj.a = sc.nextInt();

        System.out.print("Enter angle 2: ");
        obj.b = sc.nextInt();

        System.out.print("Enter angle 3: ");
        obj.c = sc.nextInt();

        obj.check();

        sc.close();
    }
}