import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayA = new int[6];
        int[] arrayB = new int[6];

        System.out.println("Enter 6 numbers for array A:");
        for (int i = 0; i < 6; i++) {
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Enter 6 numbers for array B:");
        for (int i = 0; i < 6; i++) {
            arrayB[i] = sc.nextInt();
        }

        int sum1 = 0;
        for (int i = 0; i < 6; i += 2) {
            sum1 += arrayB[i] + arrayA[i + 1];
        }
        System.out.println("Sum1 = " + sum1);

        int sum2 = 0;
        for (int i = 0; i < 6; i += 2) {
            sum2 += arrayA[i] + arrayB[i + 1];
        }
        System.out.println("Sum2 = " + sum2);
    }
}
