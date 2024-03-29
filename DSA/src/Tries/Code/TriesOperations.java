/*
     Notes:
         -> Tries is prefix tree
         -> Tries store prefix one time
         -> Tries gives unique Substrings
         -> Tires is also Known as retrivel tree
         -> Tries are at max 26 childrens
         -> Tries Gives optimized time complexity & wrost Space Complexity
         -> Tires are use in find out word or substring in string with the help of prefix suffix.

 */

package Tries.Code;

public class TriesOperations {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    /*
        words[] = {"the", "a", "there", "their", "any", "thee"};

                                 . (root)
                                / \
                               t   a
                              /     \
                             h       n
                            /         \
                           e __ e      y (eow)=True
                          / \ 
                         r   i
                        /     \
            (eow)=true e       r (eow)=true
     */

    public static void insert(String word){ //O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){ //O(L)
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
