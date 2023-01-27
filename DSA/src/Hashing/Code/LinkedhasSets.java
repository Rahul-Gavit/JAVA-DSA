/*
    Notes:
        -> Ordered Using DLL
        -> Time Complexity O(1)
 */

package Hashing.Code;

import java.util.LinkedHashSet;

public class LinkedhasSets {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangoluru");
        System.out.println(cities);
    }
}
