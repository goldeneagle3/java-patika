import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please , provide first number: ");
        a = scan.nextInt();

        System.out.println("Please , provide second number: ");
        b = scan.nextInt();

        System.out.println("Please , provide third number: ");
        c = scan.nextInt();


        if (a > b){
            if (a > c){
                if (b > c){
                    System.out.println(c + "<" + b + "<" + a);
                }else {
                    System.out.println(b + "<" + c + "<" + a);
                }
            }else {
                System.out.println(b + "<" + a + "<" + c);
            }
        }else if(b > a){
            if (b > c){
                if (a > c){
                    System.out.println(c + "<" + a + "<" + b);
                }else {
                    System.out.println(a + "<" + c + "<" + b);
                }
            }else {
                System.out.println(a + "<" + b + "<" + c);
            }

        }
    }
}
