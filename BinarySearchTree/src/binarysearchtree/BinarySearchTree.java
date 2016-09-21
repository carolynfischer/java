package binarysearchtree;

/**
 *
 * @author carry
 */
public class BinarySearchTree {
    
    public static void main(String[] args) throws Exception {
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        
        Testers.checkMembersAndCardinality(e, 5);
        Testers.checkMembersAndCardinality(n, 5);
        Testers.checkMembersAndCardinality(n, 6);
        
        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t; 
            if (i % 10 == 0) {
                t = Testers.rndTree(0);
            } else {
                t = Testers.rndTree(10);
            }
            Testers.checkMembersAndCardinality(t, i);
        }
    }

}
