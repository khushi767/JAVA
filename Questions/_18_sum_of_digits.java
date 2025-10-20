import java.util.Scanner;
public class _18_sum_of_digits {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number you want to find sum of: ");
        int num=input.nextInt();
        int sum=sumofDigit(num);
        System.out.println("Sum of digits is: "+sum);

    }

    public static int sumofDigit(int num){
        int sum=0;
        while(num>0){
        
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }

        return sum;
    }
}
