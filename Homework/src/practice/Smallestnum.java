package practice;

public class Smallestnum {
 static int a[] = {10,20,30,40};
 
 static int smallest() {
	 int min = a[0];
	 for (int i=1;i>a.length;i++)
		  if(a[i]>min)
			 min=a[i];
	         return min;
  }
     public static void main(String[] args) {

	System.out.println("the smallest number is "+smallest());
 }
 }

 