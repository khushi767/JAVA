//package JAVA_OOPS;

public class Car {
    int noofwheels;
    String color;
    float maxSpeed;
    float currentfuelinlitres;
    int noofseats;

    public void drive() {
        System.out.println("Car is driving");
        currentfuelinlitres--;
    }

    public void addfuel(float fuel) {
        currentfuelinlitres += fuel;
    }

    public float getcurrentfuellevel() {
        return currentfuelinlitres;
    }
}
