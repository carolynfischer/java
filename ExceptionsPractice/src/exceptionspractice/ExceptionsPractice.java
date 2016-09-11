package exceptionspractice;

/**
 *
 * @author carry
 */
public class ExceptionsPractice {

    public static void main(String[] args) {
        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Excetion thrown " + e);
        } finally {
            System.out.println("Finally finished try-catch");
        }
    }
    
}
