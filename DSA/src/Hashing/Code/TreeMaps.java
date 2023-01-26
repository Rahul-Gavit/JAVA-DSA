/*
    Notes:
        -> Keys are sorted
        -> Time Complexity of put, get, remove are O(logn)
        -> TreeMaps are implemented by using Red Black Trees
 */

package Hashing.Code;
import java.util.TreeMap;
public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("Chaina", 150);
        tm.put("Nepal", 50);
        tm.put("US", 60);

        System.out.println(tm);
    }
}
