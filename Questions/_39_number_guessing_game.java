import java.util.Scanner;
public class _39_number_guessing_game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=5,guess;
        System.out.println("Welcome to number guessing game");
        do{
            System.out.println("please guess no between 0 an 10");
            guess=input.nextInt();

        }while(num!=guess);
        System.out.println("you have successfully guessed the number");
        input.close();
    }
}
