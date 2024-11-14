import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        Quad quad = new Quad(a, b, c);
        quad.calculate();        
    }
}

class Quad {
    float a, b, c, d;
    float r1, r2;

    Quad(float x, float y, float z) {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    void calculate() {
        d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("Roots not possible");
        } else if (d == 0) {
            float root = -b / (2 * a);
            System.out.println("Root = " + root);
            System.out.println("Roots are equal");
        } else {
            float dSqrt = (float)Math.sqrt(d);
            float root1 = (-b + dSqrt) / (2 * a);
            float root2 = (-b - dSqrt) / (2 * a);
            System.out.println("First root = " + root1);
            System.out.println("Second root = " + root2);
        }
    }
}