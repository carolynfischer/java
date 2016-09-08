package scope;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

    Difference(int[] a) {
        this.elements = a;
    }
    
    public int computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                //System.out.println("i " + i + " j " + j + " = " + Math.abs(elements[i]-elements[j]));
                if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                    maximumDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
        return maximumDifference;
    }
}