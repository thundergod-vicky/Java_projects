public class big_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int s = i; s >= 1; s--) {
                System.out.print(s);
            }
            for (int s = 2; s <= i; s++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
