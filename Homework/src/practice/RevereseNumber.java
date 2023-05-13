package practice;

public class RevereseNumber {
	
	public static void main(String[]args) {
		
		int num=567;
		
		String temp=Integer.toString(num);
		
		char a[]=temp.toCharArray();
		
		int size = a.length;
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}
}
