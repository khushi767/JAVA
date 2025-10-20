import java.util.Scanner;
public class _14_odd_even_bitwise {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome of odd/even calculator suing bitwise operator");
        System.out.println("please enter your number: ");
        int num=input.nextInt();

        if((num&1)==1){
            System.out.println("your number is odd");
        }
        else{
            System.out.println("your number is even");
        }
        input.close();
    }
}
