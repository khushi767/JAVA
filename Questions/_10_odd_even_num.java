import java.util.Scanner;
public class _10_odd_even_num {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Check if a number is even or odd");
        int number= input.nextInt();
        if(number%2==0){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
        input.close();
    }
}
