import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Do you want to calculate the volume of:");
        System.out.println("1 - A cube");
        System.out.println("2 - A cuboid");
        System.out.println("3 - A cylinder");
        System.out.print("Enter choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter value for side: ");
                int side = sc.nextInt();
                int volume1 = volume(side);
                System.out.println("Volume of the cube = " + volume1);
                break;
            case 2:
                System.out.print("Enter value for length: ");
                double length = sc.nextDouble();
                System.out.print("Enter value for breadth: ");
                double breadth = sc.nextDouble();
                System.out.print("Enter value for height: ");
                double height = sc.nextDouble();
                double volume2 = volume(length, breadth, height);
                System.out.println("Volume of the cuboid = " + volume2);
                break;
            case 3:
                System.out.print("Enter value for radius: ");
                double radius = sc.nextDouble();
                System.out.print("Enter value for height: ");
                double cylinderHeight = sc.nextDouble();
                double volume3 = volume(radius, cylinderHeight);
                System.out.println("Volume of the cylinder = " + volume3);
                break;
        }
    }

    static int volume(int side) {
        return side * side * side;
    }

    static double volume(double l, double b, double h) {
        return l * b * h;
    }

    static double volume(double r, double h) {
        return Math.PI * (r * r) * h;
    }
}
