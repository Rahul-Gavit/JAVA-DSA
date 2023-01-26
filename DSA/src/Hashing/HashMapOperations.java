package Hashing;
import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {

        //Create
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert -> O(1)
        hm.put("India", 150);
        hm.put("Nepal", 100);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(hm.size());

        //Get -> O(1)
        System.out.println(hm.get("India"));

        //ContainsKey
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        //Remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //IsEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
