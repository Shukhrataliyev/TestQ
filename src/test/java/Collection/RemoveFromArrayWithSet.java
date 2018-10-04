package Collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveFromArrayWithSet {

	
	public static void main(String[] args) {

//-----------primitives are not allowed in collections------------------------
		
	/*  String[] arr = {"a","a","c","b","a"};
		
		List<String> lstWithDupl = Arrays.asList(arr);
	    Set<String> lstWithoutDupl = new HashSet<>(lstWithDupl);
		
	    System.out.println(lstWithDupl);
	    System.out.println(lstWithoutDupl);
	*/
		
	    
//		Integer[] arr = {1,2,3,4,5,4,3,2};
//		
//		List<Integer> a = Arrays.asList(arr);
//		
//		List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(arr));
//	    List<Integer> listWithoutDuplicates = new ArrayList<>(
//	      new HashSet<>(listWithDuplicates));
//	
//	    System.out.println(listWithDuplicates);
//	    System.out.println(listWithoutDuplicates);


//------------convert to object---------------------
		int[] arr = {1,2,3,4,5,4,3,2};
		Integer[] arr2 = new Integer[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.valueOf(arr[i]);
		}
		
		List<Integer> lstWithDupl = Arrays.asList(arr2);
	    Set<Integer> lstWithoutDupl = new HashSet<>(lstWithDupl);
	    
	    
	    
//	
//	    System.out.println(listWithDuplicates);
//	    System.out.println(listWithoutDuplicates);

	    
//	    --------------Set-----------------------
//		System.out.println(Arrays.toString(arr));
//	    Set<Integer> setString = new HashSet<>();
//	    for(int i=0;i<arr.length;i++){
//	        setString.add(arr[i]);
//	    }
//	    System.out.println(setString);
	    
	    
	    
	    
	}

}
