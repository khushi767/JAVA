import java.util.Scanner;
public class _22_reverse_digits_of_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("reverse the digits of a number");
        System.out.println("Please enter your number: ");
        int num=input.nextInt();
        int reverse=reverse(num);
        System.out.println("Reverse of your number is: "+reverse);
        input.close();
    }

    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit=num%10;
            newNum=newNum*10+digit;
            num/=10;

        }
        return newNum;
    }
    
}
