package animal;

public class Dog extends Animal {
    public Dog() {
        super(15); // references Animal
        System.out.println("A dog has been created.");
    }
    
    public void ruff() {
        System.out.println("The dog says ruff!");
    }
    
    public void eat() {
        System.out.println("A dog is eating.");
    }
    
    //public abstract eat() if we wanted to make it even more abstract
    // e.g. have subclasses for Dog
    
    public void sleep() {
        System.out.println("A dog is sleeping.");
    }
    
    public void run() {
        System.out.println("A dog is running.");
    }
}
