
/*
Encapsulation says 2 things:
1. An Object's Characteristics and its behaviour are encapsulated together
within that Object.
2. All the characteristics or behaviours are not for everyone to access.
Object should provide data security.

We follow above 2 pointers about Object of real world in programming by:
1. Creating a class that act as a blueprint for Object creation. Class contain
all the characteristics (class variable) and behaviour (class methods) in one block,
encapsulating it together.
2. We introduce access modifiers (public, private, protected, default) etc to provide data
security to the class members.
*/
class F1RaceCar {
    private String brand;
    private String model;
    private boolean isEngineOn = false;
    private int currentSpeed = 0;
    private int currentGear = 0;

    private String tyreCompany;

    public F1RaceCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getTyreCompany() {
        return tyreCompany;
    }

    public void setTyreCompany(String tyreCompany) {
        this.tyreCompany = tyreCompany;
    }

    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " : Engine starts with a roar!");
    }

    public void shiftGear(int gear) {
        this.currentGear = gear;
        System.out.println(brand + " " + model + " : Shifted to gear " + currentGear);
    }

    public void accelerate() {
        if(!isEngineOn) {
            System.out.println(brand + " " + model + " : Engine is off! Cannot accelerate.");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand + " " + model + " : Accelerating to " + currentSpeed + " km/h");
    }

    public void brake() {
        currentSpeed -= 20;
        if(currentSpeed < 0) {
            currentGear = 0;
        }
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
    }

    public void stopEngine() {
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " : Engine turned off.");
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        F1RaceCar myF1RaceCar = new F1RaceCar("Ferrari", "SF-25");

        myF1RaceCar.startEngine();
        myF1RaceCar.shiftGear(1);
        myF1RaceCar.accelerate();
        myF1RaceCar.shiftGear(2);
        myF1RaceCar.accelerate();
        myF1RaceCar.shiftGear(3);
        myF1RaceCar.accelerate();
        myF1RaceCar.shiftGear(4);
        myF1RaceCar.accelerate();
        myF1RaceCar.shiftGear(5);
        myF1RaceCar.accelerate();
        myF1RaceCar.brake();
        myF1RaceCar.stopEngine();

        System.out.println("Current Speed of My Sports Car is " + myF1RaceCar.getCurrentSpeed());
    }
}
