import java.util.Scanner;

class DayType {
    int day;

    void check() {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day number.");
        }
    }
}

public class Q26_DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DayType obj = new DayType();

        System.out.print("Enter day number (1-7): ");
        obj.day = sc.nextInt();

        obj.check();

        sc.close();
    }
}