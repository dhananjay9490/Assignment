package Day1;

public class diamondStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 9; j++) {

				if (j == 6 - i || j == 4 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");
		}

		int k = 2;
		for (int i = 6; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if (j == k || j == 14 - i) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}

			k++;
			System.out.println("");

		}
	}

}
