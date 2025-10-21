import java.util.Scanner;
public class _15_multiplication_table{
    public static void main(String args[]){
        System.out.println("Multiplication table of a number");
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number=input.nextInt();
        printMultiplication_Table(number);
        input.close();
    }

    public static void printMultiplication_Table(int n){
        int i=1;
        while(i<=10){
            System.out.println(n +"X"+i+"="+(n*i));
            i++;
        }

    }
}
