import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Select an option:");
        System.out.println("1 - Square or cube");
        System.out.println("2 - Product or sum");
        System.out.println("3 - String equality");
        System.out.print("Enter choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                System.out.println("Enter character: ");
                char ch1 = sc.next().charAt(0);
                num_cal(num, ch1);
                break;
            case 2:
                System.out.print("Enter number a: ");
                int a = sc.nextInt();
                System.out.print("Enter number b: ");
                int b = sc.nextInt();
                System.out.println("Enter character: ");
                char ch2 = sc.next().charAt(0);
                num_cal(a, b, ch2);
                break;
            case 3:
                System.out.print("Enter first string: ");
                String str1 = sc.next();
                System.out.print("Enter second string: ");
                String str2 = sc.next();
                num_cal(str1, str2);
                break;
        }
    }

    static void num_cal(int num, char ch) {
        if (ch == 's' || ch == 'S') {
            System.out.println("Square value is " + num * num);
        } else {
            System.out.println("Cube value is " + num * num * num);
        }
    }

    static void num_cal(int a, int b, char ch) {
        if (ch == 'p' || ch == 'P') {
            System.out.println("Product is " + a * b);
        } else {
            System.out.println("Sum is " + (a + b));
        }
    }

    static void num_cal(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }
}
