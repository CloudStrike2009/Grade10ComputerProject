import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice of triangle 1 or 2: ");
        int choice = sc.nextInt();

        System.out.print("Enter the number of rows for your triangle: ");
        int n = sc.nextInt();

        int ctr = 1;
        switch (choice) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print((ctr * ctr) + "  ");
                        ctr++;
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = n; i >= 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print((ctr * ctr) + "  ");
                        ctr++;
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid choice entered.");
                break;
        }
    }
}
