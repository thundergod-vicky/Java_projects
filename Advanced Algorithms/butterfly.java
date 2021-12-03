
public class butterfly {

    public static void main(String[] args) {

        int n = 4;

        // 1

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space

            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }

            // 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space

            int s = 2 * (n - i);
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }

            // 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}