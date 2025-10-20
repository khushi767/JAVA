import java.util.Scanner;

public class _23_fibonnaci_series {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter number to which u want fibbonaci series:");
    int num=input.nextInt();
    System.out.println("here is fibbonaci series: ");
    printFibonnaci(num);

   } 
   public static void printFibonnaci(int num){
    if(num<1)return;
    System.out.println("0 ");
    if(num==0)return;
    {
System.out.println("1 ");
    }
    int first=0,second=1;
    while(first+second<=num){
        int third=first+second;
        System.out.println(third+" ");
        first=second;
        second=third;
    }


   }
}
