package Collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
 
public class RemovefromArrListWithSet {
 
public static void main(String[] args){
    
    List<String>  arraylist = new ArrayList<String>();
    
    arraylist.add("instanceofjava");
    arraylist.add("Interview Questions");
    arraylist.add("Interview Programs");
    arraylist.add("java");
    arraylist.add("Collections Interview Questions");
    arraylist.add("instanceofjava");
    arraylist.add("Java Experience Interview Questions");
    
    
   // System.out.println("Before Removing duplicate elements:"+arraylist);
    
    HashSet<String> linkedhashset2 = new HashSet<String>(arraylist);
    System.out.println(linkedhashset2);
    
    HashSet<String> linkedhashset = new HashSet<String>();
    
    /* Adding ArrayList elements to the LinkedHashSet
     * in order to remove the duplicate elements and 
     * to preserve the insertion order.
     */
    linkedhashset.addAll(arraylist);
    System.out.println(linkedhashset);
    
 
    // Removing ArrayList elements
    arraylist.clear();
 
    // Adding LinkedHashSet elements to the ArrayList
    arraylist.addAll(linkedhashset);
 
    //System.out.println("After Removing duplicate elements:"+arraylist);
 
}
 
}