import java.util.Scanner;

class Triangle {
    double a, b, c;

    void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle: " + area);
    }
}

public class Q1_HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle obj = new Triangle();

        System.out.print("Enter side 1: ");
        obj.a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        obj.b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        obj.c = sc.nextDouble();

        obj.calculateArea();

        sc.close();
    }
}