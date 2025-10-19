//Automatic type conversion: widening-implicit
//byte->short->int->long->float->double
//Narrowing (explicit)
//byte<--short<--int<--long<--float<--double

//Type casting and typeconversion
public class _05_typecasting {
   public static void main(String args[]){
    float myFloat=5;
    System.out.println(myFloat);
//explicit conversion if we want to assign big values such as double to smaller values int,float
    float myInt=(float)5.45f;
    System.out.println(myInt);
    int yourInt=(int)5.4f;
    System.out.println(yourInt);
   }
}

/*
 Type Conversion: IMplicit conversion or coercion, Explicit conversion or casting
literal chota hona chahiye container bda hona chhaiye
 //implicit
 long big=45;
 float dec=3;
 double d=3.4f;
 //explicit
 float eDec=(float)3.4;
 long eBig=(long)3.4;
 int eInt=(int)3.4;
 */