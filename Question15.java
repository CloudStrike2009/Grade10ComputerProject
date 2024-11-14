import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cities = new String[5];
        System.out.println("Enter the names of 5 cities:");
        for (int i = 0; i < 5; i++) {
            cities[i] = sc.next();
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length - 1; j++) {
                if (cities[j].compareTo(cities[j + 1]) < 0) {
                    String temp = cities[j];
                    cities[j] = cities[j + 1];
                    cities[j + 1] = temp;
                }
            }
        }

        System.out.println("Cities sorted in descending order:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
