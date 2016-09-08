package animal;

/**
 *
 * @author carry
 */
public abstract class Animal {

    public int age;
    
    // contructor
    public Animal(int age) {
        this.age = age;
        System.out.println("Animal has been created!");
    }
    
    public abstract void eat();
    
    public void sleep() {
        System.out.println("An animal is sleeping.");
    }
    
    // you can get private variables in a public class, if this was changed to private
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();
        
        // Object Casting
        Object dog = new Dog();
        // dog. douesn't have Dog methods like ruff()
        // convert back to a real dog to get the methods
        Dog realDog = (Dog) dog;
        realDog.ruff();
        
        Object str = "est";
        String realS = (String) str;
        // now have access to string methods again
        realS.charAt(0);
        
        // what happens when...
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }
    
}
