import java.util.Scanner;
public class _08_temp_convertor{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to temp convertor: ");
        System.out.println("Enter your temp in fahrenheit:");
        float fahrenheit=input.nextFloat();
        float celcius=(fahrenheit-32)*5/9;
        System.out.println("your temp is: "+celcius+"C");

    }
}