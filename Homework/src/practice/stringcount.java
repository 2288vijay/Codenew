package practice;

public class stringcount {
	public static void main (String[] args){


		String s = "i like songs";
		int count=0;
		
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				count++;
			}
		}

	System.out.println(count);
}
}
