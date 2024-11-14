import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full path and file name: ");
        String input = sc.next();

        int slashPos = input.lastIndexOf('\\');
        String fullFileName = input.substring(slashPos + 1);

        int dotPos = fullFileName.lastIndexOf('.');

        String extension = fullFileName.substring(dotPos + 1);
        String fileName = fullFileName.substring(0, dotPos);
        String path = input.substring(0, slashPos + 1);

        System.out.println("Path: " + path);
        System.out.println("File name: " + fileName);
        System.out.println("Extension: " + extension);
    }
}
