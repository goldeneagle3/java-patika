import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km , age ,type;
        double totalPrice,discount,perKM = 0.10;

        Scanner scanner = new Scanner(System.in);
        // One direction - Round trip

        System.out.println("Please , enter your age : ");
        age = scanner.nextInt();

        System.out.println("Please , enter the distance : ");
        km = scanner.nextInt();

        System.out.println("If you want to select one direction press 1 or if you want to select a round trip ticket please press 2...");
        type = scanner.nextInt();

        if (age < 0 || km < 0){
            System.out.println("Distance and age must be higher than 0");

            System.out.println("Please , enter your age : ");
            age = scanner.nextInt();

            System.out.println("Please , enter the distance : ");
            km = scanner.nextInt();
        }

        if (type != 1 && type != 2){
            System.out.println("Enter only 1 or 2 for the type of fly.");

            System.out.println("If you want to select one direction press 1 or if you want to select a round trip ticket please press 2...");
            type = scanner.nextInt();
        }

        double plainPrice = km * perKM;

        double resultPriceOfType = typeOfFly(type,plainPrice);
        System.out.println(resultPriceOfType);

        if(age < 12){
            totalPrice = makeDiscount(0.5,resultPriceOfType);
        } else if (age >= 12 && age <= 24 ) {
            totalPrice =  makeDiscount(0.1,resultPriceOfType);
        } else if (age > 65) {
            totalPrice = makeDiscount(0.3,resultPriceOfType);
        }else {
            totalPrice = resultPriceOfType;
        }


        System.out.println(totalPrice);

    }

    private static double typeOfFly(int type,double price) {
        if (type == 2){
            return makeDiscount(0.2,price * 2);
        }else {
            return price;
        }
    }

    private static double makeDiscount(double rate,double price){
        if (rate >= 0 && rate <= 1){
            return price - (price * rate);
        }
        return price;
    }


}
