
//Object is created using new keyword
//allocates memory for object in heap
//object ka variable is called reference;
//myCar is reference
//array is also an object cause uses new keyword
//it has dynamic allocation i.e memory allocated at runtime and not at compile time.
//Student student1=new Student()
//Student=className, student1=objectName, new=keyword, Student=Constructor

//Student student1== Decleration
//new=instantiation,myclass()-->initialization
/* 

//access object using .operator like product.price
//class is a blueprint, objects are real values
public class _03_object_creation {
    
}*/



//package JAVA_OOPS;

public class Driver {
    public static void main(String[] args) {
      /*  Car myCar = new Car(); // creation of object
        myCar.addfuel(5);
        myCar.drive();
        System.out.println("Fuel left: " + myCar.getcurrentfuellevel());
        */

        Car swift=new Car();
        swift.addfuel(6);
        swift.start();
        swift.drive();
        Car startedcar=swift.start();
        startedcar.drive();
        swift.start().drive();
    }
}
