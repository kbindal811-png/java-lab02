import java.util.Scanner;

class VisitorCounter {
    int visitors;

    void demonstrate() {
        System.out.println("Initial visitors: " + visitors);
        System.out.println("Visitor entering (prefix): " + (++visitors));
        System.out.println("Visitor count: " + visitors);
        System.out.println("Visitor leaving (postfix): " + (visitors--));
        System.out.println("Visitor count: " + visitors);
    }
}

public class Q4_PrefixPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VisitorCounter obj = new VisitorCounter();

        System.out.print("Enter initial number of visitors: ");
        obj.visitors = sc.nextInt();

        obj.demonstrate();

        sc.close();
    }
}