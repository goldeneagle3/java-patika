import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double perKm = 2.20 , initFee = 10.0 , roadFee , total;
        int km;

        Scanner impl = new Scanner(System.in);

        System.out.println("Provide the km you went out : ");
        km = impl.nextInt();

        roadFee = km * perKm;

        total = initFee + roadFee;

        if (total < 20) {
            total = 20;
        }

        System.out.println("Your total fee is : " + roundToTwoDigit(total));
    }

    private static double roundToTwoDigit(double fee){
        return Math.round(fee * 100.0) / 100.0;
    }
}
