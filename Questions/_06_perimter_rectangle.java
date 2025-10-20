import java.util.Scanner;
public class _06_perimter_rectangle{
    public static void main(String args[]){
        System.out.println("Welcome to calculate perimeter of rectangle");
        Scanner input= new Scanner(System.in);
        System.out.println("enter first side: ");
        int side1= input.nextInt();
        System.out.println("enter second side: ");
        int side2=input.nextInt();
        System.out.println("enter third side: ");
        int side3=input.nextInt();
        System.out.println("enter fourth side: ");
        int side4=input.nextInt();

        int product= (side1*side2*side3*side4);
        System.out.println("Permiter of rectange is: "+product);

        System.out.println("------------------------");
        System.out.println("Welcome to triangle area calculator");
        System.out.println("Please enter base in cms: ");
        double base=input.nextDouble();
        System.out.println("Plese enter your perpendicular: ");
        double perpendicular=input.nextDouble();
        Double area=0.5*base*perpendicular;
        System.out.println("Area of triangle is: "+area+" cm2");

    }
}