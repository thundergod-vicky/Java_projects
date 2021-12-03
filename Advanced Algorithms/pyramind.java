public class pyramind {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// public class pyramind {

// public static void main(String[] args) {

// int n = 5;

// for (int i = 1; i < n + 1; i++) {

// for (int j = n; j > i; j--) {
// System.out.print(" ");

// }

// for (int j = 0; j < i; j++) {
// System.out.print(" " + i);
// }
// System.out.println();

// }

// }
// }