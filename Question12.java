import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        String shortName = "";

        int spacePos = name.lastIndexOf(' ');
        shortName = name.substring(spacePos + 1);
        name = name.substring(0, spacePos);

        spacePos = name.lastIndexOf(' ');
        while (spacePos >= 0) {
            shortName = "" + Character.toUpperCase(name.charAt(spacePos + 1)) + '.' + shortName;
            name = name.substring(0, spacePos);
            spacePos = name.lastIndexOf(' ');
        }

        shortName = "" + Character.toUpperCase(name.charAt(0)) + '.' + shortName;

        System.out.println(shortName);
    }
}
