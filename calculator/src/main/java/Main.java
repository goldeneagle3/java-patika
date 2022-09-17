import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOne,numTwo,select,result;

        Scanner impl = new Scanner(System.in);

        System.out.println("To sum provide 1n\n");
        System.out.println("To subtract provide 2\n");
        System.out.println("To multiply provide 3\n");
        System.out.println("To divide provide 4\n");

        System.out.println("Please select your first number : ");
        numOne = impl.nextInt();

        System.out.println("Please select your second number : ");
        numTwo = impl.nextInt();

        System.out.println("Please select your operation number : ");
        select = impl.nextInt();

        switch (select){
            case 1:
                result = numOne + numTwo;
                break;
            case 2:
                result = numOne - numTwo;
                break;
            case 3:
                result = numOne * numTwo;
                break;
            case 4:
                result = numOne / numTwo;
                break;
            default:
                result = 0;
        }

        System.out.println("Result is " + result);

    }
}
