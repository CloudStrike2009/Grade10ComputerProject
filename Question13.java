import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next().toLowerCase();

        char[] chars = new char[26];
        int index = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!charInArray(chars, ch, index)) {
                System.out.print(ch);
                chars[index] = ch;
                index++;
            }
        }
    }

    static boolean charInArray(char[] chars, char ch, int index) {
        for (int i = 0; i < index; i++) {
            if (chars[i] == ch) {
                return true;
            }
        }
        return false;
    }
}
