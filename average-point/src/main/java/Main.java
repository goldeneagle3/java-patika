import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double math , chem , physic , english , biology, avg;

        System.out.println("Point must be in 0 and 100 otherwise it will count as 0.");

        math = checkRange(getPoint("math"));
        chem = checkRange(getPoint("chem"));
        physic = checkRange(getPoint("physic"));
        english = checkRange(getPoint("english"));
        biology = checkRange(getPoint("biology"));

        avg = (math + chem + physic + english + biology) / 5;

        if (avg < 55){
            System.out.println("We are sorry but you did not get enough point to pass the class.Your average is " + avg);
        }else {
            System.out.println("Congratulations.Your average point is " + avg);
        }


    }

    private static double checkRange(double point) {
        if (point < 0 && point > 100){
            System.out.println("Point must be in 0 and 100 otherwise it will count as 0.");
            return 0;
        }

        return point;
    }

    private static double getPoint(String lesson) {
        Scanner impl = new Scanner(System.in);
        System.out.println("Provide your " + lesson + " note: ");
        return impl.nextDouble();
    }


}
