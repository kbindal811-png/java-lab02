class PerfectSquares {
    void display() {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i)
                continue;

            System.out.print(i + " ");
        }
    }
}

public class Q28_SkipPerfectSquares {
    public static void main(String[] args) {
        PerfectSquares obj = new PerfectSquares();

        System.out.println("Numbers from 1 to 50 excluding perfect squares:");
        obj.display();
    }
}