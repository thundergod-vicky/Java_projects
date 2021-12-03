
public class paralal {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int p = 1; p <= n - i; p++) {

                System.out.print(" ");

            }
            for (int p = 1; p <= 5; p++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// public class paralal {

// public static void main(String[] args) {

// int n = 5;

// for (int i = 0; i <= n; i++) {
// for (int j = n; j > i; j--) {
// System.out.print(" ");
// }
// for (int j = 0; j < n; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }