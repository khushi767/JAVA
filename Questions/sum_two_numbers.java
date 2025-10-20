import java.util.Scanner;
public class sum_two_numbers {
    public static void main(String args[]){
    System.out.println("Welcome");
    System.out.println("Please enter first number");
    Scanner input=new Scanner (System.in);
    int firstnum=input.nextInt();
    System.out.println("enter second number");
    int secondnum=input.nextInt();
    int sum=firstnum+secondnum;
    System.out.println("sum of two numbers is"+sum);
    input.close();
}
}


