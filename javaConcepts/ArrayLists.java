package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        //ADD ELEMENTS
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //GET ELEMENTS
        int element = list.get(0);
        System.out.println(element);

        //ADD ELEMENT IN BETWEEN
        list.add(1, 1);
        System.out.println(list);

        //SET ELEMENT
        list.set(0, 5);
        System.out.println(list);

        //DELETE ELEMENT
        list.remove(3);
        System.out.println(list);

        //RETURN SIZE OF ARRAYLIST
        System.out.println(list.size());

        //LOOPS
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //SORTING
        Collections.sort(list);
        System.out.println(list);
    }
}