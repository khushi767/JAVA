import java.util.Scanner;
public class _16_sum_oddnos_tillN {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to odd sum");
        int num=input.nextInt();
        int sum=odd_number(num);
        System.out.println("Odd sum till "+num+" is: "+sum);

    }

    public static int odd_number(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i+=2;
        }

        return sum;
    }
}
