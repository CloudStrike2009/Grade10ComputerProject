import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];
        System.out.println("Enter 5 words");
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next().toUpperCase();
        }

        int palindromeCount = 0;
        for (int i = 0; i < 5; i++) {
            if (isPalindrome(words[i])) {
                palindromeCount++;
            }
        }

        System.out.println("Number of palindrome words: " + palindromeCount);
    }

    static boolean isPalindrome(String word) {
        // Compare character one by one from the start and end of the word.
        int start = 0;
        int end = word.length() - 1;
        while (start <= end) {
            // If any of the characters does not match, then the word
            // is not a palindrome. Return false immediately.
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        // If we reach here, then the word is a palindrome
        return true;
    }
}
