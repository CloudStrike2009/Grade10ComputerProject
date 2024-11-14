import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        FruitJuice juice = new FruitJuice();
        juice.input();
        juice.discount();
        juice.display();
    }
}

class FruitJuice {
    int productCode;
    String flavour;
    String packType;
    int packSize;
    int productPrice;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        productCode = sc.nextInt();

        System.out.print("Enter the flavour: ");
        flavour = sc.next();

        System.out.print("Enter the pack type: ");
        packType = sc.next();

        System.out.print("Enter the pack size: ");
        packSize = sc.nextInt();

        System.out.print("Enter the product price: ");
        productPrice = sc.nextInt();
    }

    void discount() {
        productPrice -= (10 * productPrice) / 100;
    }

    void display() {
        System.out.println("Product code : " + productCode);
        System.out.println("Flavour      : " + flavour);
        System.out.println("Pack type    : " + packType);
        System.out.println("Pack size    : " + packSize);
        System.out.println("Product price: " + productPrice);
    }
}