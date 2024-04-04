import java.util.Scanner;

public class uts3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input angka 1 - ... : ");
        int a = scanner.nextInt();

        if (isPalindrome(a)) {
            System.out.println(a + " adalah palindrom");
        } else {
            System.out.println(a + " bukan palindrom");
        }

        scanner.close();
    }

    public static int reverse(int temp) {
        int b = 0;
        while (temp != 0) {
            int c = temp % 10;
            b = b * 10 + c;
            temp /= 10;
        }
        return b;
    }

    public static boolean isPalindrome(int temp) {
        return temp == reverse(temp);
    }
}