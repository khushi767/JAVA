import java.util.Scanner;
public class _16_ternary_operator {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("welcome to number checker");
      System.out.println("Enter your first number");
      int num1=input.nextInt();
      System.out.println("Enter second number: ");
      int num2=input.nextInt();
        int greatestnumber=num1>num2?num1:num2;
        System.out.println(greatestnumber+" is the greatest number");
        input.close();
    }
}
