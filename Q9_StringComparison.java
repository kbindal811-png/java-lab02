import java.util.Scanner;

class StringCompare {
    String first, second;

    void compare() {
        int length = Math.min(first.length(), second.length());
        int result = 0;

        for (int i = 0; i < length; i++) {
            if (first.charAt(i) > second.charAt(i)) {
                result = 1;
                break;
            } else if (first.charAt(i) < second.charAt(i)) {
                result = -1;
                break;
            }
        }

        if (result == 0) {
            if (first.length() > second.length())
                result = 1;
            else if (first.length() < second.length())
                result = -1;
        }

        if (result == 0)
            System.out.println("Both strings are equal.");
        else if (result > 0)
            System.out.println(first + " comes after " + second);
        else
            System.out.println(first + " comes before " + second);
    }
}

public class Q9_StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringCompare obj = new StringCompare();

        System.out.print("Enter first string: ");
        obj.first = sc.nextLine();

        System.out.print("Enter second string: ");
        obj.second = sc.nextLine();

        obj.compare();

        sc.close();
    }
}