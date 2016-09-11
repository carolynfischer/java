package calculator;

/**
 *
 * @author carry
 */
class Calculator {
            
    static int power(int n, int p) throws Exception {
        int ans;
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            ans = (int) Math.pow(n, p);
            return ans;
        }
    }
}
