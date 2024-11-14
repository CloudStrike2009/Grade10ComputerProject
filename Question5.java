import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the parcel: ");
        String name = sc.next();

        System.out.print("Enter the weight: ");
        int wt = sc.nextInt();

        Parcel parcel = new Parcel();
        parcel.display(wt, name);
    }    
}

class Parcel {
    int calculate(int w1) {
        int charge = 40;
        int remainingWeight = w1 - 100;
        while (remainingWeight > 0) {
            charge += 20;
            remainingWeight -= 50;
        }
        return charge;
    }

    void display(int w2, String name2) {
        int charge = calculate(w2);
        System.out.println("Total service charge for " + name2 + " is Rs." + charge);
    }
}