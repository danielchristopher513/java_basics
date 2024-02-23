package Collections;

import java.util.*;
class testtreeset{
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        System.out.println(set.contains("Ravi"));
        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
