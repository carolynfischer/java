package hotchocolate;

/**
 *
 * @author carry
 */
public class HotChocolate {

    // want to make everything static in this class
    public static final double tooHot = 185;
    public static final double tooCold = 160;
    
    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,
            TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }
    
    public static void main(String[] args) {
        double currentCocoaTemp = 170;
        try {
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That cocoa was good!");
        } catch (TooHotException e1) {
            System.out.println("THAT's too hot! ");
        } catch (TooColdException e2) {
            System.out.println("That's so cold! It's like the arctic! ");
        }
        
        System.out.println("And it's gone.");
    }
    
}
