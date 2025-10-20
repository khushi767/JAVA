import java.util.Scanner;
public class _13_bitwise_operator {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Bitwise operator");
        System.out.println("Please enter first number: ");
        int first=input.nextInt();
        System.out.println("Enter second number: ");
        int second=input.nextInt();
        int and_operator=first & second;
        System.out.println("Bitwise and of two nos is : "+and_operator);
        int or_operator= first |second;
        System.out.println("bitwise or of two nos is : "+ or_operator);
        int xor_operator=first^second;
        System.out.println("Bitwise xor of two numbers is : "+xor_operator);
        int compliment=~first;
        System.out.println("Compliment of number is: "+compliment);
        int leftshift=first<<4;
        System.out.println("Leftshift of a number is: "+leftshift);

        int rightshift=second>>2;
        System.out.println("Rightshift of a number is: "+rightshift);
        input.close();

    }
    
}
