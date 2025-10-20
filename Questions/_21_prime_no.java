import java.util.Scanner;
public class _21_prime_no {
    public static void main(String args[]){
        System.out.println("Finding if a number is prime or not");
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your number");
        int num=input.nextInt();
        boolean isprime=isPrime(num);
        System.out.println("your number is "+isprime);
        input.close();
    } 

    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
