package Day1;

public class series1 {

//	(a+2^0*b), (a+2^0*b+2^1*b).......(a+2^0*b+2^1*b......+2^n-1*b)
//	where a, b and n are user defined variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 2;
		double b = 1;
		double n = 5;
		double sum = 0;

		for (int i = 0; i < n; i++) {

			if (i == 0) {
				sum += a + Math.pow(2.0, i * b);

			} else {
				sum += Math.pow(2.0, i * b);
			}
			System.out.print((int) sum + ", ");
		}

	}


}
