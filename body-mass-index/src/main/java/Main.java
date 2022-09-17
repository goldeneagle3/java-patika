import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner impl = new Scanner(System.in);
        double height , weight;

        System.out.println("Please provide your height : ");
        height = impl.nextDouble();

        System.out.println("Please provide your weight : ");
        weight = impl.nextDouble();

        System.out.println("Your bmi is : " + weight / (height * height));
    }
}
