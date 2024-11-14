import java.util.Scanner;

public class Question2 {
    // Calculates the factorial of the given number n.
    static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }

    static double calcItem(int a, int exp, int d) {
        return Math.pow(a, exp) / factorial(d);
    }

    static void calculateS1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter a limit n: ");
        int n = sc.nextInt();

        boolean subtract = true; // track whether we're subtracting or adding
        int exp = 1;             // exponent value, starting at 1
        int f = 2;               // number to calculate factorial for
        double s1 = calcItem(a, exp, f);

        for (int i = 1; i < n; i++) {
            exp += 3;
            f += 2;

            // If subtract is true, then subtract the next value.
            // Otherwise, add the next value.
            if (subtract) {
                s1 -= calcItem(a, exp, f);
            } else {
                s1 += calcItem(a, exp, f);
            }

            // Flip the subtract boolean.
            subtract = !subtract;
        }

        System.out.println("S1 = " + s1);
    }

    static void calculateS2()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a limit m: ");
        int m = sc.nextInt();

        // Calculate Fibonacci series
        int x = 0;
        int y = 1;
        int s2 = 0;
        for (int i = 1; i < m; i++) {
            s2 += y;
            y = x + y;
            x = y - x;
        }

        System.out.println("S2 = " + s2);
    }

    public static void main(String[] args) {
        System.out.println("Calculating sum of first series S1:");
        calculateS1();

        System.out.println("Calculating sum of second series S2:");
        calculateS2();
    }
}
