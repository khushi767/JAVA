import java.util.Scanner;
public class _05_product_floating_pt {
   public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("We are doing float multiplication\n");
    System.out.println("Please enter firdt decimal number: ");
    double first=input.nextDouble();
    System.out.println("Please enter Second number: ");
    double Second=input.nextDouble();
     double multiply=first*Second;
     System.out.println("Result is: "+multiply);
   } 
}
