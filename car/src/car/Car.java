package car;

/**
 *
 * @author carry
 */
public class Car {
    
    // properties of objects. double allows decimal places, float is a bit 
    // smaller than double, but also allows decimals
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    // customize car
    
    public Car() {
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println("Number of people in car: " + numberOfPeopleInCar);
    }
    
    public void wreckCar() {
        condition = 'C';
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public void getIn() {
        if(numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone got into the car");
        } else {
            System.out.println("The car is full" + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
    }
    
    public void getOut() {
        if(numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("Noone is in the car " + numberOfPeopleInCar);   
        }
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn() {
        if(isTheCarOn == false) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on " + isTheCarOn);
        }
    }
    
    public static void main(String[] args) {
        Car tommycar = new Car();
        tommycar.getOut();
        tommycar.getOut();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.getIn();
        tommycar.turnTheCarOn();
        tommycar.turnTheCarOn();
    }
    
}
