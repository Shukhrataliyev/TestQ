package Collection;

import java.util.HashSet;
import java.util.Iterator;
 
public class HashsetExample{
 
public static void main(String[] args) {
  
//create object of HashSet
 HashSet<Integer> hashSet = new HashSet();
       
 //add elements to HashSet object
 hashSet.add(1);
 hashSet.add(2);
 hashSet.add(3);
 hashSet.add(4);
 hashSet.add(5);
     
 /*
 To check whether a particular value exists in HashSetwe need to use
  boolean contains(Object value) method of HashSet class.
 this method returns true if the HashSet contains the value, otherwise returns false.
 */
       
        boolean isExists = hashSet.contains(5);
        System.out.println("5 exists in HashSet ? : " + isExists);    
 

 
Iterator it=hashSet.iterator();
             
while(it.hasNext()){
System.out.println(it.next());
                     
}   
 
}
 
}