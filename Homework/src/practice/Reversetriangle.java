package practice;


public class Reversetriangle {
public  void downtri() {
	
	int n=5;  
	
	//for(int i = n; i>=1; i--) {
	//	for (int j = 1;j<=i;j++) {
	//	System.out.print("*");	
	//	}
	//	System.out.println();
	//}
		for (int i =1;i<=n;i++) // row
		{
			for (int j=i;j<=n;j++) // column
			{
				System.out.print("* ");
			}System.out.println();
		}
}
   public static void main(String[] args) {
	
	   Reversetriangle obj =new Reversetriangle();
	   obj.downtri();
}
}