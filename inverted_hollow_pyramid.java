public class inverted_hollow_pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--){
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                if (i == n || k == 0 || k == 2 * i - 2) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
