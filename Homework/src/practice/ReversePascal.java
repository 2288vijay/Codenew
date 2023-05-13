package practice;

public class ReversePascal {

	public void leftup() {
		int n=5;
		for (int i= 1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void leftdown() {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ReversePascal ab = new ReversePascal();
		ab.leftup();
		ab.leftdown();
		ab.leftup();
		ab.leftdown();
	}
}
