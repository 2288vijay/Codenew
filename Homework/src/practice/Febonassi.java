package practice;

public class Febonassi {
 // static void main(String[] args) {
	
	// int n = 20, a = 0, b = 1;
	// 
	// for (int i = 1;i<=n;i++)
	// {
	//	 System.out.print(a+" ,");
	// 
	 // int j= a+b;
	 //     a=b;
	//      b=j;
    // }	
//}
	 static int a=0 , b=1 ,c=0;
	 
	 static void fb(int count) {
		 if(count>0) {
			c=a+b; // c=1 , 2
			a=b; // a = 1 , 1
			b=c; // b= 1 , 2 
			
			System.out.print(" "+ c);
			fb(count-1);
		 }
	 }
	 public static void main(String [] args) {
		 int count=10;
		 System.out.print(a+" "+b);
		    fb(count-2);
	 }	 
}
