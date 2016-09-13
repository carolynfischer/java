package starwarsinterfacepractice;

/**
 *
 * @author carry
 */
public class Enemy implements Character {
    
    public String weapon = "lighsaber";
    
    // constructor must exist, even if empty
    public Enemy() {
        
    }
    
    // this signature has to match what is in character and it has to match. 
    // All of the methods from Characher must be implemented here!
    @Override
    public void attack() {
        System.out.println("The enemy attacks you.");
    }
    
    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public void weaponDraw() {
        System.out.println("Draw out weapon");
    }
}
