package practice;

public class ReverseEachWord {
	
 public static void main(String[] args) {
	
	 String str = "hello java world";
		
		String[] words=str.split(" "); //splitting string into words
		
		String reverseString="";
		
		for(String w: words) //you 
		{
			String reverseword=" ";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString=reverseString+reverseword+"";
		}
		
		System.out.println(reverseString);
}	
}
