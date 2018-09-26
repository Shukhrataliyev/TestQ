package Collection;

import java.util.ArrayList;

import java.util.ArrayList;

public class RemoveElementfromArrayList{
 
public static void main(String[] args) {
 
   //create an ArrayList object
        ArrayList<String> arrayList = new ArrayList<String>();
       
        //Add elements to Arraylist
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C"); 
        arrayList.add("A");
       
  /*
   To remove an element from the specified index of ArrayList use
    Object remove(int index) method.
    It returns the element that was removed from the ArrayList. */
 
    Object obj = arrayList.remove(1);
     System.out.println(obj + " is removed from ArrayList");
       
  System.out.println("ArrayList contains...");
  //display ArrayList elements using for loop
    for(int index=0; index < arrayList.size(); index++)
    System.out.println(arrayList.get(index));
  
 
 }
}