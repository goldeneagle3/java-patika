import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner impl = new Scanner(System.in);

        int firstSide,secondSide;
        double hypotenuse,area,perimeter;

        System.out.println("Please provide the first side (make sure it is integer) : ");
        firstSide = impl.nextInt();

        System.out.println("Please provide the second side (make sure it is integer) : ");
        secondSide = impl.nextInt();

        double totalSides = (firstSide * firstSide) + (secondSide * secondSide);

        hypotenuse = Math.sqrt(totalSides);
        double u = (firstSide + secondSide + hypotenuse) / 2;
        perimeter = 2 * u;
        area = u * (u- firstSide)*(u-secondSide)*(u-hypotenuse);

        System.out.println("Hypotenuse is : " + hypotenuse);
        System.out.println("The perimeter is : " + perimeter);
        System.out.println("The area is : " + Math.sqrt(area));




    }
}
