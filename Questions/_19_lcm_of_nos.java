import java.util.Scanner;
public class _19_lcm_of_nos {
    public static void main (String args[]){
    Scanner input=new Scanner (System.in);
    System.out.println("please enter first number: ");
    int first=input.nextInt();
    System.out.println("Please enter second number: ");
    int second=input.nextInt();
    int lcm=lcm(first,second);
    System.out.println("LCM of two numbers is: "+lcm);
    input.close();

}

public static int lcm(int first,int second){
int i=1;
while(i<=second){
    int factor=first*i;
    if(factor%second==0){
        return factor;
    }
    i++;
}
    return 0;
}

}
