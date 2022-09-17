import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pear = 2.14 , apple = 3.67, tomatoes = 1.11,banana = 0.95,aubergine=5.00;
        int amountPear,amountApple,amountTomatoes,amountBanana,amountAubergine;

        Scanner impl = new Scanner(System.in);

        System.out.println("How many kilo pear : ");
        amountPear = impl.nextInt();
        System.out.println("How many kilo apple : ");
        amountApple = impl.nextInt();
        System.out.println("How many kilo tomatoes : ");
        amountTomatoes = impl.nextInt();
        System.out.println("How many kilo banana : ");
        amountBanana = impl.nextInt();
        System.out.println("How many kilo aubergine : ");
        amountAubergine = impl.nextInt();


        double totalPrice =
                (pear * amountPear) +
                (apple * amountApple) +
                (tomatoes * amountTomatoes) +
                (banana * amountBanana) +
                (aubergine * amountAubergine);


        System.out.println("Total price is " + totalPrice);
    }
}
