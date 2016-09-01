package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author carry
 */
public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
    }
    
    public static void main(String[] args) {
        // Declaring, allocating, initializing
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 9, 1, 3};
        String[] shoppingList = {"Bananas", "Apples", "Pears"};
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        // print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        // custom printing
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();
        
        // retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3)); // same thing as above
        System.out.println();
        
        // given function
        // destructive, chances the places where elements are
        Arrays.sort(intArray3); 
        printArray(intArray3);
        
        // special for loop
        System.out.println("Speical for loop");
        for (String s: shoppingList) {
            System.out.println(s);
        }
    }
    
}
