package practice;

public class overload {

	public void fb(int a) {
		System.out.println(a);
	}
	public void fb(String b) {
		System.out.println(b);
	}
	public static void main (String [] args) {
		overload obj = new overload();
		obj.fb(10);
		obj.fb("abc");
	}
}
