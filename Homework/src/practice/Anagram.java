package practice;

import java.util.Arrays;

public class Anagram {
 
	public static void main (String[]args) {
		
		String a= "earth";
		String b= "heart";
		
		char x[]=a.toCharArray(); //toCharArray() method converts the given string into a sequence of characters
		char y[]=b.toCharArray();
	
        Arrays.sort(x);	//a e h r y 
        Arrays.sort(y);// a e h r y 
     
        boolean result = Arrays.equals(x,y);
        
        if(result == true) {
        	System.out.println("Strings are anagram");
        }
        else {
        	System.out.println("String are not anagram");
        }
	}
}
