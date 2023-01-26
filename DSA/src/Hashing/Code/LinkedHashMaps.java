/*
    Notes:
        -> It's Perform same operations & Time Complexity as HashMap

    prperties:
        -> keys are insertion ordered
           (Jis order me keys Insert kiyi Hai usi order me keys get hongi)
        -> In LinkedHasMap (Doubly LinkedList) data structure are use for arrengement in order perpose.

 */

package Hashing.Code;
import java.util.*;
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Chaina", 150);
        lhm.put("Nepal", 50);
        lhm.put("US", 60);

        System.out.println(lhm);

    }
}
