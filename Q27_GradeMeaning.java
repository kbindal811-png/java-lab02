import java.util.Scanner;

class Grade {
    char grade;

    void display() {
        switch (Character.toUpperCase(grade)) {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            case 'D':
                System.out.println("Below Average");
                break;

            case 'E':
                System.out.println("Poor");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade.");
        }
    }
}

public class Q27_GradeMeaning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Grade obj = new Grade();

        System.out.print("Enter grade (A-F): ");
        obj.grade = sc.next().charAt(0);

        obj.display();

        sc.close();
    }
}