package animal;

/**
 *
 * @author carry
 */
public class Animal {

    public int age;
    
    // contructor
    public Animal(int age) {
        this.age = age;
        System.out.println("Animal has been created!");
    }
    
    public void eat() {
        System.out.println("An animal is eating.");
    }
    
    // you can get private variables in a public class, if this was changed to private
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.age); // can access with pubilc, but not when it's private
        c.meow();
        System.out.println(c.age);
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        
        // we can't use Dog class to ruff directly
        
    }
    
}
