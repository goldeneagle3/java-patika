import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner impl = new Scanner(System.in);

        double kdvRate = 0.18;
        double productPrice,kdvAmount,totalPrice;


        System.out.println("Please provide the price of the product : ");
        productPrice = impl.nextDouble();

        kdvAmount = productPrice * kdvRate;
        totalPrice = productPrice + kdvAmount;

        System.out.println("the kdv rate of the product is : " + kdvAmount);
        System.out.println("the total price of the product is : " + totalPrice);

    }
}
