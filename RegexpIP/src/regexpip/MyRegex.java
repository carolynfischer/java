package regexpip;

/**
 *
 * @author carry
 */
public class MyRegex {
    String octet = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = "(" + octet + "\\.){3}" + octet;  
}
