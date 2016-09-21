package user;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author carry
 */
public class User {

    String userName;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.userName = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    
    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(1212);
        User carolyn = new User("carry", "helloworld", 10, a);
    }

}
