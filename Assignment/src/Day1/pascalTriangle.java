package Day1;

public class pascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i && j<=10-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
