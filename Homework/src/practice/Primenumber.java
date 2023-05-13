package practice;

public class Primenumber {
public static void main(String[] args) { 
	
	for (int i=2;i<=100;i++) {
		
		int a=0;
		
		for (int j=2; j<=i-1;j++) 
		  {
			if (i%j ==0){
			a++;
		  }
	      }	
	        if (a==0) 
	      {
		    System.out.print(i+",");
	      }
   }
}
}