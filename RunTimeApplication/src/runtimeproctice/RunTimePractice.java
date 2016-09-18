package runtimeproctice;

import java.util.HashMap;

/**
 *
 * @author carry
 */
public class RunTimePractice {

    // O(n)
    public static int findNumsOfRepetitions(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }
    
    // O(n*m)
    public static int[] findNumsOfRepetitionsv1(String s, char[] c) {
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }
    
    // O(n + m)
    public static int[] findNumsOfRepetitionsv2(String s, char[] c) {
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {                
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }
        
        for (int j = 0; j < c.length; j++) {
            int sum;
            if (map.containsKey(c[j])) {
                sums[j] = map.get(c[j]);
            } else {
                sums[j] = 0;
            }
        }
        return sums;
    }
    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abca", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");

        char[] a = {'a', 'b'};
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv1("aoenadoieaheudsnaoeoauuiowebmkoeutdgthdhtdeoaeeodhxwbeojntshnthhuesshnthntheoikvdoesuntdsntnnteduavowhedivwaoehdtheodintnchnhypievwhdvowheduvtoaedicnthsntdnthhvdiewnchsnhtdhfgrcpditbvwmobeuvwmaovmxuvmoawxeavmxxvovwaoepx", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv2("aoenadoieaheudsnaoeoauuiowebmkoeutdgthdhtdeoaeeodhxwbeojntshnthhuesshnthntheoikvdoesuntdsntnnteduavowhedivwaoehdtheodintnchnhypievwhdvowheduvtoaedicnthsntdnthhvdiewnchsnhtdhfgrcpditbvwmobeuvwmaovmxuvmoawxeavmxxvovwaoepx", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");        
    }

}
