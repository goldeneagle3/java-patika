import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14,centerAngle;

        Scanner impl = new Scanner(System.in);

        System.out.println("Prove the radius : ");
        r = impl.nextInt();

        System.out.println("Prove the center angle of circle : ");
        centerAngle = impl.nextDouble();

        System.out.println("The area of circle is : " + (pi * r * r));
        System.out.println("The perimeter of circle is : " + (2 * pi * r));
        System.out.println("The area of piece of circle is : " + ((pi * (r * r) * centerAngle) / 360));


    }
}
