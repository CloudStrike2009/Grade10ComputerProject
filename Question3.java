import java.util.Scanner;

public class Question3 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isSpecialNumber(int num) {
        int sum = 0;
        int n = num;
        while (n > 0) {
            // Get the last digit from the number
            int digit = n % 10;

            // Remove the last digit from the number
            n = n / 10;

            sum += factorial(digit);
        }

        return num == sum;
    }

    static boolean isHarshadNumber(int num) {
        int sum = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSpecialNumber(num)) {
            System.out.println("The number is a special number.");
        } else {
            System.out.println("The number is not a special number.");
        }

        if (isHarshadNumber(num)) {
            System.out.println("The number is a Harshad number.");
        } else {
            System.out.println("The number is not a Harshad number.");
        }
    }
}
