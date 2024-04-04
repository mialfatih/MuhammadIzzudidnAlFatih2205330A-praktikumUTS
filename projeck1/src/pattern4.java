public class pattern4 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
