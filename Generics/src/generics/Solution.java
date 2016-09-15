/*
 * Copyright 2016 Carolyn Van Spyk
 */

package generics;
import java.lang.reflect.Method;

/**
 * @author carry
 */

class Solution {
    static <D> void printArray(D[] array) {
        for (D element : array) {
            System.out.println(element);
        }
    }
    
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}