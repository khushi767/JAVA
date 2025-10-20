import java.util.Scanner;
public class _03_shorthand_operator {
    public static void main(String args[]){
        int a=6;
        Scanner input=new Scanner(System.in);
        int x1=input.nextInt();
        a=a+x1;
        System.out.println(a);
        int x2=input.nextInt();
        a=a+x2;
        System.out.println(a);
        input.close();

    }
}
