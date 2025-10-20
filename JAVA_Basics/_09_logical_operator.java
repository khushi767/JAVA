import java.util.Scanner;
public class _09_logical_operator {
   public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to ticket discount calculator");
    System.out.println("Please enter your age: ");
    int age=input.nextInt();
    System.out.println("Are you a female? (true/false)");
    boolean isFemale=input.nextBoolean();
    if(age<5){
        System.out.println("you got 75% discount: ");

    }
    else if(isFemale){
        System.out.println("you got 50% Discounnt");

    }
    else if(age>60 && !isFemale){
        System.out.println("you got 25% discount");
    }
    else{
        System.out.println("you got no disxount");

    }
    input.close();
   } 
}
