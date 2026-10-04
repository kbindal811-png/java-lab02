import java.util.Scanner;

class LeapYearRange {
    int year, start, end;

    void check() {
        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end)
            System.out.println(year + " is a leap year and is within the range.");
        else
            System.out.println(year + " does not satisfy both conditions.");
    }
}

public class Q10_LeapYearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LeapYearRange obj = new LeapYearRange();

        System.out.print("Enter year: ");
        obj.year = sc.nextInt();

        System.out.print("Enter starting range: ");
        obj.start = sc.nextInt();

        System.out.print("Enter ending range: ");
        obj.end = sc.nextInt();

        obj.check();

        sc.close();
    }
}
