/*
    Notes:
        -> No duplicates (Store Unique Values)
        -> Unordered (HashSet implemented by using HashMap)
        -> Null is allowed
 */

package Hashing.Code;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        HashSet<String> cities = new HashSet<>();
        
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangoluru");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // for (String city : cities) {
        //     System.out.println(city);
        // }

        
        System.out.println();

        set.add(1);
        set.add(2);
        set.add(4);

        System.out.println(set);

        set.remove(2);

        if(set.contains(2)){
            System.out.println("Its Contains 2");
        }
        
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
        
    }
}
