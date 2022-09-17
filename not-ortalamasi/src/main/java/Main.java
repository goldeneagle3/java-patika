import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int math , physic, chemistry,turkish , history;

        Scanner impl = new Scanner(System.in);


        // Get the values from users
        System.out.println("Your math note is : ");
        math = impl.nextInt();

        System.out.println("Your physic note is : ");
        physic = impl.nextInt();

        System.out.println("Your chemistry note is : ");
        chemistry = impl.nextInt();

        System.out.println("Your turkish note is : ");
        turkish = impl.nextInt();

        System.out.println("Your history note is : ");
        history = impl.nextInt();

        System.out.println((math + physic + chemistry + turkish + history) / 5);


    }
}
