/*public static void main(String args[]){
recurse()
}
static void recurse(){
recurse()
}

recursion is when a function calls itself, base case is essential to stop recursion and prevent infinite loops. Excessive recursion can cause stack overflow errors.
 * 
 */
import java.util.Scanner;

public class _22_recursion{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to factorial generator");
        System.out.println("please enter yoru number");
        int num=input.nextInt();
        long fact=factorialIterative(num);
        System.out.println("factorial of number is: "+ fact);
        long fac=factorial(num);
        System.out.println(fac);
        input.close();
        
    }

    public static long factorial(int num){
        if(num==1){
            return 1;

        }
        return num*factorial(num-1);
    }

    public static long factorialIterative(int num){
        long result=1;
        for(int  i=1;i<=num;i++){
            result*=i;
        }
        return result;
    }
}