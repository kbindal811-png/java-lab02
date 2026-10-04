import java.util.Scanner;

class CompoundInterest {
    double principal, rate, time;

    void calculate() {
        double amount = principal * Math.pow((1 + rate / 100), time);
        double interest = amount - principal;

        System.out.println("Compound Interest: " + interest);
        System.out.println("Amount: " + amount);
    }
}

public class Q2_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompoundInterest obj = new CompoundInterest();

        System.out.print("Enter principal: ");
        obj.principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        obj.rate = sc.nextDouble();

        System.out.print("Enter time: ");
        obj.time = sc.nextDouble();

        obj.calculate();

        sc.close();
    }
}