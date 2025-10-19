//Assignment operator:
/*
 Unary Operators: works on single operator, increment,decrement,etc
 */
public class _06_operators {
    public static void main(String args[]){
        int myInt=9;
        System.out.println(myInt);
        int newint=myInt;
        System.out.println(newint);

        int x=5;
        int y=-x;
        int z=-y;
        System.out.println(y);

        int a=5;
        a=a+1;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(++a);
    }
}
