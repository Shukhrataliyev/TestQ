package Collection;

import java.util.HashSet;
import java.util.Iterator;
 
public class HashsetCopyToArray{
 
public static void main(String[] args) {
  
//create object of HashSet
 HashSet<Integer> hashSet = new HashSet();
       
 //add elements to HashSet object
 hashSet.add(1);
 hashSet.add(2);
 hashSet.add(3);
 hashSet.add(4);
 hashSet.add(5);
     
Object[] objArray = hashSet.toArray();
 
//display contents of Object array
System.out.println("HashSet elements are copied into an Array. Now Array Contains..");
 
 for(int index=0; index < objArray.length ; index++)
  System.out.println(objArray[index]);

 
System.out.println("Hashset contains");
 
Iterator it=hashSet.iterator();
             
while(it.hasNext()){
System.out.println(it.next());
                     
}   
 
}
 
}
 