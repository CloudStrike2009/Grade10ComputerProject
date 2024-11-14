import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("Invalid input");
        } else {
            String finalStr = "";
            for (int i = 0; i < str1.length(); i++) {
                finalStr = finalStr + str1.charAt(i) + str2.charAt(i);
            }
            System.out.println(finalStr);
        }
    }
}
