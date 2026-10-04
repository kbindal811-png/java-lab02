import java.util.Scanner;

class PasswordCheck {
    String correctPassword = "java123";
    String password;

    void check() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword))
                System.out.println("Incorrect password.");

        } while (!password.equals(correctPassword));

        System.out.println("Correct password. Access granted.");

        sc.close();
    }
}

public class Q20_Password {
    public static void main(String[] args) {
        PasswordCheck obj = new PasswordCheck();

        obj.check();
    }
}