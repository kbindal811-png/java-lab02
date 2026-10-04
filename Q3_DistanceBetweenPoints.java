import java.util.Scanner;

class Distance {
    double x1, y1, x2, y2;

    void calculate() {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance: " + distance);
    }
}

public class Q3_DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance obj = new Distance();

        System.out.print("Enter x1: ");
        obj.x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        obj.y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        obj.x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        obj.y2 = sc.nextDouble();

        obj.calculate();

        sc.close();
    }
}