import java.util.Scanner;
public class _04_userInput{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name=input.nextLine();
        System.out.println("Goodmorning "+name);
        System.out.print(name+" ,Also tell me your age");
        int age=input.nextInt();
        System.out.println("your age is:"+age);
        input.close();
    }
}

/*
 * string name=scanner.nextLine();
 * System.out.println("Welcome" +name);
 * 
 * 
 * Similarly we can use: nextInt(),nextDouble,nextFloat(),nextLong(),
 * 
 */