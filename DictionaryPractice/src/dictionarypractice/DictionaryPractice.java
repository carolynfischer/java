package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author carry
 */
public class DictionaryPractice {

    

    public static void main(String[] args) {
        // English to Spanish dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        // Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        // Retrieve our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print out all the keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all the values
        System.out.println(englSpanDictionary.values());
        // Print out the size of the dictionary
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());
        System.out.println();
        System.out.println();
        
        // Shopping list, Boolean has to be capital
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        // Put some stuff in the dictionary 
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE); // two ways how to set boolean
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put(("Sugar"), false);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        System.out.println(shoppingList.get("Sugar"));
        // Key value pairs printout
        System.out.println(shoppingList.toString());
        // Clear out dictionary
        // shoppingList.clear();
        System.out.println(shoppingList.toString());
        // Is empty?
        System.out.println(shoppingList.isEmpty());
        shoppingList.remove("Eggs");
        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());
    }
    
}
