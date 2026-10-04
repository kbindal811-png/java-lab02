import java.util.Scanner;

class Rainfall {
    double total;

    void calculate(double[] rainfall) {
        for (double rain : rainfall) {
            total += rain;
        }

        System.out.println("Total rainfall: " + total);
    }
}

public class Q7_Rainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] rainfall = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter rainfall for day " + (i + 1) + ": ");
            rainfall[i] = sc.nextDouble();
        }

        Rainfall obj = new Rainfall();
        obj.calculate(rainfall);

        sc.close();
    }
}