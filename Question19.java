import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers in ascending order:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

            // Ensure that the entered number is greater than the previous number.
            // Check only from index 1
            if (i > 0 && numbers[i] <= numbers[i - 1]) {
                System.out.println("Number entered is not in ascending order.");
                return;
            }
        }

        System.out.print("Enter number to search for: ");
        int num = sc.nextInt();

        // Binary search for num
        int low = 0, high = numbers.length - 1, mid = -1;
        boolean found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (num > numbers[mid]) {
                low = mid + 1;
            } else if (num < numbers[mid]) {
                high = mid - 1;
            } else {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + num + " was found at index " + mid);
        } else {
            System.out.println("Element not found.");
        }
    }
}
