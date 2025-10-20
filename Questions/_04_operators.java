import java.util.Scanner;
public class _04_operators {
    public static void main(String args[]){
System.out.println("Welcome to Arithmetic calculator");
Scanner input=new Scanner(System.in);
System.out.println("Please enter first number a: ");
int a=input.nextInt();
System.out.println("Please enter second number b: ");
int b=input.nextInt();

int sum=a+b;
System.out.println(sum);
int sub=a-b;
System.out.println("Subtraction of two numbers is: "+sub);
int product=a*b;
System.out.println("Product of two numbers is: "+product);



    }
}
