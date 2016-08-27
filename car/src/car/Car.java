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
    
    // customize car
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
        numberOfPeopleInCar++;
    }
    
    public void getOut() {
        numberOfPeopleInCar--;
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public static void main(String[] args) {
//        Car familyCar = new Car();
//        System.out.println("Family's car");
//        familyCar.printVariables();
        /* A reference type means that it is a shared object (shared car in this */
        /* case). */
//        Car aliceCar = familyCar;
//        familyCar.wreckCar();
//        familyCar.upgradeMinSpeed();
//        System.out.println("Alice's car");
//        aliceCar.printVariables();
        /* When changing a primitive type (int, boolean, double, char), the */
        /* original value doesn't change, but when you change a reference type, */ 
        /* the original does change. Some other reference types are: arrays, */ 
        /* queues, linked lists, stacks. */
        
        /* Constructing custom objects */
        /* Here birthday car and christmas car are entirely separate, nothing we */
        /* do to the birthday car affects the christmas car. */
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left:"  + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles per fillup: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday car v3");
        birthdayPresent.printVariables();
//        System.out.println("Christmas car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
        
    }
    
}
