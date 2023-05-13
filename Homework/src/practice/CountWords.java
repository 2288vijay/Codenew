package practice;

public class CountWords {

	public static void main (String[]args) {
		
		String a = " hello java";
		int count = 0;
		
		for (int i=0;i<a.length()-1;i++) {
			
			if((a.charAt(i)==' ') && (a.charAt(i+1) != ' ')) {
				
				count++;
			}
		}
		System.out.println(count);
	}
}
