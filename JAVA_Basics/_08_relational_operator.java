import java.util.Scanner;
public class _08_relational_operator{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.println("Please enter your age: ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("you are eligible to drive ");
        }
        else{
            System.out.println("Not eligible for License");
        }
input.close();
    }
}
