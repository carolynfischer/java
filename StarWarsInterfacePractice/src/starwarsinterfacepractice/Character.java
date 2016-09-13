package starwarsinterfacepractice;

/**
 *
 * @author carry
 */
public interface Character {
    // this property can't be changed by anything
    public String base = "character";
    
    // signature of the attack function
    public void attack();
    public void heal();
    public String getWeapon();
}
