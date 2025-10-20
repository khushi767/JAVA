import java.util.Scanner;
public class _20_GCD_two_nos {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to GCD: ");
        
        System.out.println("Please enter your first number: ");
        int first=input.nextInt();
        System.out.println("Please enter second number: ");
        int second=input.nextInt();
        int gcd=gcd(first,second);
        System.out.println("GCD of two numbers is: "+gcd);
        input.close();

    }

    public static int gcd(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
