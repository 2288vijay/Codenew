package practice;

public class Vowels {
	public static void main(String[] args) {

		String str = "dianosour";

		char a[] = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				a[i] = '$';
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
