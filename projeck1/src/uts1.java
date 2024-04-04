import java.util.Scanner;

public class uts1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("imput tiga angka : ");
        int temp = scanner.nextInt();

        if (isPalindrome(temp)) {
            System.out.println(temp + " adalah palindrom");
        } else {
            System.out.println(temp + " bukan palindrom");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int temp) {
        int a = temp;
        int b = 0;

        while (temp != 0) {
            int c = temp % 10;
            b = b * 10 + c;
            temp /= 10;
        }

        return a == b;
    }
}
