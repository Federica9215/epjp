package b09;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class S096 {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = aSortedSet();
        System.out.println(sortedSet);
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println(sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
    }

    private static SortedSet<Integer> aSortedSet() {
        return new TreeSet<Integer>(Arrays.asList(12, 18, -5, -2233));
    }//ho passato Arrays.asList(12, 18, -5, -2233) al treeset

}
