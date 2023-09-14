//Write a Java Program to find the Transpose of a given Matrix.

package Day1;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 19 } };
		System.out.println(matrix.length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix after clockwise Rotation");

		for (int j = 0; j < matrix.length; j++) {
			for (int i = matrix.length - 1; i >= 0; i--) {

				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

}
