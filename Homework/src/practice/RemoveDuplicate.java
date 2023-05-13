package practice;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	String str = "Badal Naik";
	 int x = 0;
	 int size = str.length();
	
	 char []a=str.toCharArray();
	 
	 for(int i=0;i<=size-1;i++) {
		 if(a[i]=='a') {
			 System.out.print("");
		 }else
			 {System.out.print(a[i]);}
		 
	 }
}
}
