import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] salaries = new int[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the employee name: ");
            names[i] = sc.next();

            System.out.print("Enter salary of " + names[i] + ": ");
            salaries[i] = sc.nextInt();
        }

        System.out.println("Enployees earning more than Rs.50000 per month:");
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > 50000) {
                System.out.println(names[i] + " - Rs." + salaries[i]);
            }
        }
    }
}
