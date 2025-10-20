import java.util.Scanner;

public class _11_greatest_of_three_nos {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to world of three");
        System.out.print("enter your first number");
        int first=input.nextInt();
        System.out.print("enter your second number");
        int second=input.nextInt();
        System.out.print("enter your thrd number");
        int third=input.nextInt();

        if(first>=second && first>=third){
            System.out.println(first + " is greatest number");
        }
        else if(second>=third){
            System.out.println(second+"is the greatest number");

        }
        else{
            System.out.println(third+"is the greatest number");
        }

    }
}
