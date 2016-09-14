package personpointers;

import static personpointers.HairColor.*;

/**
 *
 * @author carry
 */
public class PersonPointers {
    HairColor hairColor = RED;
    
    public PersonPointers() {
    }
    
    public static void main(String[] args) {
        PersonPointers peterParker = new PersonPointers();
        // create alias
        PersonPointers spiderMan = peterParker;
        
        peterParker.hairColor = BLACK;
        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of SpiderMan: " + spiderMan.hairColor);
    }
    
}
