/*
 * do{
 * body of loop
 * }while(condition);
 */
import java.util.Scanner;
public class _18_do_while_loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
     /*   while(age<0||age>100){
            System.out.println("please enter your age: ");
            age=input.nextInt();
        }

        */
        do{
            System.out.println("please enter your age: ");
            age=input.nextInt();
        }while(age<0||age>100);
        System.out.println("your age is: "+age);

    }
}
