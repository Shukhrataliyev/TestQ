package JavaQ;

public class LeapYear { 
    public static void main(String[] args) { 
        int year = 2016;

//        boolean isLeapYear;
//
//        // divisible by 4
//        isLeapYear = (year % 4 == 0);
//
//        // divisible by 4 and not 100
//        isLeapYear = isLeapYear && (year % 100 != 0);
//
//        // divisible by 4 and not 100 unless divisible by 400
//        isLeapYear = isLeapYear || (year % 400 == 0);
//
//        System.out.println(isLeapYear);

        
        boolean leapYear;
        
        if(year % 4 == 0 ) {
        	 if(year % 100 == 0 ) {
        		 if(year % 400 == 0 ) {
        			 leapYear = true;
        		 }else {
        			 leapYear = false;
        		 }
        	 }else {
        		 leapYear = true;
        	 }
        	        	
        }else {
        	leapYear = false;
        }
    
        System.out.println(leapYear);
    
    
    }
}
