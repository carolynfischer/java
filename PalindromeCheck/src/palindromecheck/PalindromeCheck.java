package palindromecheck;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author carry
 * 
 * Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[time limit] 3000ms (java)
[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome,
false otherwise.
 */
public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        boolean answer = palindromeRearranging(input);
        System.out.println(answer);
    }
    
    public static boolean palindromeRearranging(String inputString) {
        String[] inputArray = inputString.toString().split("");
        Map<String, Integer> map = new HashMap<String, Integer>();
        boolean result = true;
        boolean middle = false;        
        
        for (int i=0; i < inputString.length(); i++){           
            if (map.get(inputArray[i]) == null){
                map.put(inputArray[i], 1);
            } else {
                map.put(inputArray[i], map.get(inputArray[i])+1);
            }            
        }
        
        for (Map.Entry entry : map.entrySet()) {
            if (Integer.parseInt(entry.getValue().toString()) % 2 != 0){
                if (middle == false){
                    middle = true;
                } else {
                    result = false;
                }
            }
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        return result;
    }
}

