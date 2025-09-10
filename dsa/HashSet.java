package dsa;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        // FUNCTIOND USED IN HASHSET...
//        java.util.HashSet<Integer> set = new java.util.HashSet<>();     // CREATING
//        set.add(1);              // INSERTING
//        set.add(2);
//        set.add(3);
//        set.add(1);
//
//        if(set.contains(1)) System.out.println("contains 1");        // SEARCHING
//        if(!set.contains(6)) System.out.println("does not contain 6");
//
//        set.remove(1);           // DELETING AN ELEMENT
//        if(!set.contains(1)) System.out.println(" does not contains 1");
//        set.add(1);
//        System.out.println(set);      // PRINT ALL ELEMENTS
//
//        for(int it: set){              // ITERATION
//            System.out.println(it);
//        }
//
//        Iterator it = set.iterator();        // ITERATION USING ITERATOR
//        while(it.hasNext()){
//            System.out.print(it.next() + " ");
//        }


        // FUNCTIONS USED IN HASHMAP...
        HashMap<String, Integer> map = new HashMap<>();   // CREATING
        map.put("India", 120);  // INSERTION OPERATION
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);
        map.put("China", 180);     // UPDATE VALUE
        System.out.println(map);

        if(map.containsKey("China")) System.out.println("Present in the map");   // SEARCH OPERATION
        if(!map.containsKey("Africa")) System.out.println("Not present in the map");

        System.out.println(map.get("China"));  //KEY EXISTS   PRINTS VALUE
        System.out.println(map.get("Africa"));    //KEY DOESN'T EXIST

        // ITERATION IN HASHMAP
        for(Map.Entry<String, Integer> e: map.entrySet()){    // THROUGH ENTRYSET
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();     // USING KEYSET
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");     // TO REMOVE PAIR
        System.out.println(map);
    }
}
