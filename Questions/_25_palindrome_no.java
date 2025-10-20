import java.util.Scanner;
public record _25_palindrome_no() {
    public static void main(String args[]){
        System.out.println("Palindrome Number");
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num=input.nextInt();
        boolean palindrome=ispalindrome(num);
        if(palindrome){
            System.out.println("your number is palindrome number: ");
        }
        else{
            System.out.println("your number is not palindrome number: ");
        }


    }

    public static boolean ispalindrome(int num){
        int reverse=reverse(num);
        return num==reverse;

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
