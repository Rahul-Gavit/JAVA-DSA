/*
   Notes:
        -> In worst Case Time Complexity will be O(n)
        Approach:
        -> Create Key & value pair node
        -> Declare bucket size => n
        -> Declare node size => N
        -> Declare bucket as list that contains node in the form of LinkedList

        -> hashMap()
           => Initialize N size
           => Create empty linked list in each of bucket index(loop)
        
        -> hashFunction(K key)
           => convert key into hashCode & if it’s negative make it positive(Math.abs)
        
        -> searchInLL(K key, int bi)
           => take bucket index in which you want to search
           => Initialize di
           => store the ll index in node and check node key equal to our key(loop)
           => if not equal then increase data index
           => return -1
        
        -> rehash()
           => creating oldBucket list and store the all buckets in them
           => increase the bucket size double of the previous bucket
           => creating empty linkedList in new bucket(loop)
           => nodes -> add in bucket(loop)

        -> put(K key, V value)
           => find key using hashFunction and store into bi
           => find bucket index of the key and store into di
           => If key and value is present in LikedList then update Value of key
           => else add new node key & value pair in bucket index
           => Check the lambda condition 
           => If lambda is greater than threshold value then perform rehash()
        
        -> small changes in other functions (containsKey(), remove(), get(), KeySet(), isEmpty())

 */

package Hashing.Code;

import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapCode {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) { // generic
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // O(lambda) ->O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi); // valid -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi); // valid -1

            if (di != -1) { // valid
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi); // valid -1

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { // O(1)
            int bi = hashFunction(key); // 0 to 3
            int di = searchInLL(key, bi); // valid -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> KeySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("Nepal", 30);
        hm.put("China", 120);
        hm.put("US", 50);
        hm.put("Japan", 70);

        ArrayList<String> keys = hm.KeySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));

    }
}
