package practice;

import java.util.regex.Pattern;
	
public class Reverse {
	
	   public static void main(String[] args) {
		   
	      String str = "the sky is blue";
	      
	      Pattern p = Pattern.compile("\s");
	      
	      String[] temp = p.split(str);
	      
	      String rev = "";
	      
	      for (int i = 0; i < temp.length; i++) {
	    	  
	         if (i == temp.length - 1)
	         rev = temp[i] + rev;
	         else
	        	         	 
	         rev = " " + temp[i] + rev;
	      }
	      
	      System.out.println(rev);
	   }
	}

