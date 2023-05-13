package practice;

public class MissingnumberArray {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 4, 5, 0 };
		int sum = 0;
		
		int size = a.length;

		for (int i = 0; i < size; i++) {
			sum = sum + a[i] - b[i];
		}
		System.out.print("missing number is "+ sum);
	}

}
