import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,userPassword = "1234",newPassword;

        Scanner impl = new Scanner(System.in);

        System.out.println("Please provide your username");
        username = impl.nextLine();

        System.out.println("Please provide your password");
        String providedPassword = impl.nextLine();

        if (!userPassword.equals(providedPassword)){
            System.out.println("Wrong Password.Forgot your password , if you dou please enter 'y'.");
            String selection = impl.nextLine();

            if (selection.equals("y")){
                System.out.println("Please provide your new password");
                newPassword = impl.nextLine();

                if (!userPassword.equals(newPassword)){
                    userPassword = newPassword;

                    System.out.println("Now login again!");
                    System.out.println("Please provide your username");
                    username = impl.nextLine();

                    System.out.println("Please provide your password");
                    providedPassword = impl.nextLine();
                }else{
                    System.out.println("Your new password cannot be the sane as before.");
                    System.exit(0);
                }
            }
        }

        if (userPassword.equals(providedPassword)){
            System.out.println("Successful login.");
        }



    }
}
