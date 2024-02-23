package Collections;

import java.util.*;
public class Arraytest{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.set(1,"cat");
        Collections.sort(list);
        //Printing the arraylist object
        System.out.println(list);
    }
}
