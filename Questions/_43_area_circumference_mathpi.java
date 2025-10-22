import java.util.Scanner;
public class _43_area_circumference_mathpi {
    double radiusInMm;
    _43_area_circumference_mathpi(double radiusInMm){
        this.radiusInMm=radiusInMm;
    }
    double getCircumference(){
        return 2* Math.PI*radiusInMm;
    }

    double getArea(){
        return Math.PI*Math.pow(radiusInMm,2);
    }

    @Override
    public String toString(){
        return "Circle Props: Radius in mm:"+radiusInMm+"Circumference in mm:"+getCircumference()+"Area in mm^2:"+getArea();

    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to world of circle");
        System.out.println("please enter your radius: ");
        double radius=input.nextDouble();
        _43_area_circumference_mathpi circle=new _43_area_circumference_mathpi(radius);
        System.out.println(circle);
        input.close();
    }

}
