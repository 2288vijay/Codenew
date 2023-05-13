package practice;

public class Palindrome {
public static void main(String[] args) {
	int n= 656;
	int a=n;
	int rev=0;
	
	while(a>0) {
		int remainder=a%10;
		a=a/10;
		rev=rev*10+remainder;	
	}
	if(rev==n) {
		System.out.println(n+ " is palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
  }
}