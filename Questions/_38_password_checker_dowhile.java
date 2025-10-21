import java.util.Scanner;
public class _38_password_checker_dowhile {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to set your password");
    String password;
    do{
        System.out.print("please enter your password");
        password=input.next();
    }while(!isValidPassword(password));
    
}

    public static boolean isValidPassword(String password){


        return password.length()>6;

    }
}
