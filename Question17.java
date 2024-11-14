import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cities = new String[5];
        int[] maxTemps = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            cities[i] = sc.next();

            System.out.print("Enter max temperature for city " + cities[i] + ": ");
            maxTemps[i] = sc.nextInt();
        }

        int temp;
        String tempCity;

        for (int i = 0; i < maxTemps.length - 1; i++) {
            int small = maxTemps[i];
            int smallPos = i;

            for (int j = i + 1; j < maxTemps.length; j++) {
                if (maxTemps[j] < small) {
                    small = maxTemps[j];
                    smallPos = j;
                }
            }

            if (smallPos != i) {
                temp = maxTemps[i];
                maxTemps[i] = maxTemps[smallPos];
                maxTemps[smallPos] = temp;

                // Also swap the corresponding city entries
                tempCity = cities[i];
                cities[i] = cities[smallPos];
                cities[smallPos] = tempCity;
            }
        }

        System.out.println("Cities sorted in increasing order of temperature:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + " - " + maxTemps[i]);
        }
    }
}
