package practice;

public class Largestnumber {
	
public static void main(String[]args) {
	int a[]= {20,300,769,450};
	int max = a[0];
	{
	    for(int i =1;i<a.length;i++)
		if(a[i]> max) 
			max=a[i];	
	}
	    System.out.println("the largest number is "+max);
}
}


