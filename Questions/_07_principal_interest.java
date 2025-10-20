import java.util.Scanner;

public class _07_principal_interest {
    public static void main(String args[]){
System.out.println("Simple interest calculation and compound interest");
Scanner input=new Scanner(System.in);
System.out.println("please eneter principal amount: ");
double principal=input.nextDouble();
System.out.println("Enter rate of interest");
double rate_of_inteterst=input.nextDouble();
System.out.println("enter time: ");
Double time=input.nextDouble();
double SI=(principal*rate_of_inteterst*time)/100;
System.out.println("Simple interest is: "+SI);

System.out.println("Compound interest calculation");
double CI=principal*Math.pow((1+rate_of_inteterst/100),time);
System.out.println("Compund interest is: "+CI);
    }
    
}
