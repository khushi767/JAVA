import java.util.Scanner;
public class _02_swap_two_numbers {
    public static void main(String args[]){
       Scanner input=new Scanner(System.in);
       System.out.print("Enter value of a: ");
       int a=input.nextInt();
       System.out.print("Enter value of b: ");
       int b=input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapping done... ");
        System.out.println("Value of A is: "+a);
        System.out.println("Value of b is: "+b);
        input.close();
    }
}
