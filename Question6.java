import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        EvenFact evenFact = new EvenFact();
        evenFact.input();
        long sum = evenFact.evenDigit();
        System.out.println("Sum of factorials of even digits in " + evenFact.n + " is " + sum);
    }
}

class EvenFact {
    long n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        n = sc.nextLong();
    }

    long factorial(long f) {
        long fact = 1;
        for (int i = 1; i <= f; i++) {
            fact = fact * i;
        }
        return fact;
    }

    long evenDigit() {
        // Get digits of n and add factorial of even digits
        long num = n;
        long sum = 0;
        while (num > 0) {
            // Get the last digit of the number
            long digit = num % 10;

            // If the digit is even, add its factorial to sum
            if (digit % 2 == 0) {
                sum += factorial(digit);
            }

            num = num / 10;
        }

        return sum;
    }
}