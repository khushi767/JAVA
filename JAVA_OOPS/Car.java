//package JAVA_OOPS;

public class Car {
    int noofwheels;
    String color;
    float maxSpeed;
    float currentfuelinlitres;
    int noofseats;
    public Car start(){
        if(currentfuelinlitres==0){
            System.out.println("Car is out of fuel");

        }
        else if(currentfuelinlitres<5){
            System.out.println("car is in reserved state");
        }
        else{
            System.out.println("car started");
        }
        return this;
    }

    public void drive() {
        currentfuelinlitres--;
        System.out.println("Car is driving");
        
    }

    public void addfuel(float fuel) {
        currentfuelinlitres += fuel;
    }

    public float getcurrentfuellevel() {
        return currentfuelinlitres;
    }
}
