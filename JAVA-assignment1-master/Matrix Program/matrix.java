import java.util.Scanner;
public class matrix{
        public static void main(String[] args) {
		System.out.println("Please enter the rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();

		int[][] first = new int[row][column];
		int[][] second = new int[row][column];
        for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				first[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter second[%d][%d] integer", r, c));
				second[r][c] = sc.nextInt();
			}
		}
		// close the scanner
		sc.close();
		// print both matrices
		System.out.print("First Matrix:\n");
        for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.print(first[r][c]+" ");
			}
		}
		System.out.println("Second Matrix:\n");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
			System.out.print(second[r][c]+" ");
			}
		}
}}