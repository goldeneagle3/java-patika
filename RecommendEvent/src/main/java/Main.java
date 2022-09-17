import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide the heat");
        heat = scan.nextInt();

        if (heat > 25){
            System.out.println("Go to swim");
        }else {
            if (heat > 15 && heat <= 25){
                System.out.println("Go to picnic");
            }else if (heat > 5 && heat <= 15 ){
                System.out.println("Go to mountain");
            }else {
                System.out.println("Stay home");
            }
        }
    }
}
