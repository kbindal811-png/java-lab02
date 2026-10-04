import java.util.Scanner;

class StudentMarks {
    int[][] marks;

    void calculateAverage() {
        int total = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Average marks: " + average);
    }
}

public class Q25_AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentMarks obj = new StudentMarks();
        obj.marks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                obj.marks[i][j] = sc.nextInt();
            }
        }

        obj.calculateAverage();

        sc.close();
    }
}