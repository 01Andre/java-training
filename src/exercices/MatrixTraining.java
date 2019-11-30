import java.util.Arrays;

public class MatrixTraining {

	/**
	 * @param lines   height of the matrix, eg: 3
	 * @param columns width of the matrix, eg: 2
	 * @return an empty int matrix of lines and columns size,
	 * eg: {{0, 0}, {0, 0}, {0, 0}}
	 */
	public int[][] emptyIntMatrix(int lines, int columns) {
		int [][] matrix = new int [lines][columns];
		return matrix;
	}

	/**
	 * @param lines   height of the matrix, eg: 2
	 * @param columns width of the matrix, eg: 3
	 * @return an empty string matrix of lines and columns size,
	 * eg: {{null, null, null}, {null, null, null}}
	 */
	public String[][] emptyStringMatrix(int lines, int columns) {
		String [][] matrix = new String [lines][columns];
		return matrix;
	}

	/**
	 * @param a first array
	 * @param b second array
	 * @param c third array
	 * @return an int matrix with a, b and c arrays
	 */
	public int[][] intMatrix(int[] a, int[] b, int[] c) {
		int[][] matrix = new int [3][];

		matrix[1] = a;
		matrix[2] = b;
		matrix[3] = c;

		return matrix;
	}

	/**
	 * @param a first array
	 * @param b second array
	 * @param c third array
	 * @return a String matrix with a, b and c arrays
	 */
	public String[][] stringMatrix(String[] a, String[] b, String[] c) {

		String[][] matrix = new String [3][];

		matrix[1] = a;
		matrix[2] = b;
		matrix[3] = c;

		return matrix;
	}

	/**
	 * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
	 * @return number of matrix lines, eg: 3
	 */
	public int height(int[][] matrix) {

		return matrix.length;
	}

	/**
	 * @param matrix, eg: {{3, 4}, {6, 7}, {5, 8}}
	 * @return number of matrix columns, eg: 2
	 */
	public int width(int[][] matrix) {

		return matrix[0].length;
	}

	/**
	 * @param matrix, eg: {{3, 4, 5}, {6, 7, 8}}
	 * @param line,   eg: 1
	 * @param column, eg: 0
	 * @return value in matrix at line and column, eg: 6
	 */
	public int valueAtPosition(int[][] matrix, int line, int column) {

		return matrix[line][column];
	}

	/**
	 * @param matrix, eg: {{1, 2, 3}, {8, 5, 6}}
	 * @param value,  eg: 4
	 * @param line,   eg: 1
	 * @param column, eg: 0
	 * @return the matrix with the value replaced at line and column,
	 * eg: {{1, 2, 3}, {4, 5, 6}}
	 */
	public int[][] replace(int[][] matrix, int value, int line, int column) {
		matrix[line][column] = value;
		return matrix;
	}

	/**
	 * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
	 * @return sum of matrix values, eg: 21
	 */
	public int sum(int[][] matrix) {
		int matrixSum = 0;
		for (int i = 0 ; i < matrix.length; i++)
		{
			matrixSum += Arrays.stream(matrix[i]).sum();
		}
		return matrixSum;
	}

	/**
	 * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
	 * @param search, eg: 5
	 * @return if matrix contains searched value, eg: true
	 */
	public boolean contains(int[][] matrix, int search) {
		for (int [] array:matrix) {
			for (int number:array) {
				if (number == search) {
					return true;
				}
			}

		}
		return false;
	}

	/**
	 * @param matrix, eg: {{1, 2, 3}, {4, 5, 6}}
	 * @return how many even numbers are in matrix, eg: 3
	 */
	public int countEvens(int[][] matrix) {
		int numberOfEvenNumbers = 0;
		for (int [] array:matrix) {
			for (int number:array) {
				if (number%2 == 0) {
					numberOfEvenNumbers ++ ;
				}
			}

		}

		return numberOfEvenNumbers;
	}

	/**
	 * @param matrix, eg: {{'d', 'b', 'a'}, {'a', 'd', 'a'}}
	 * @param search, eg: 'a'
	 * @return the number of character occurrences in matrix, eg: 3
	 */
	public int occurrences(char[][] matrix, char search) {
		int numberOfOccurences = 0;
		for (char [] array:matrix) {
			for (char letter:array) {
				if (letter == search) {
					numberOfOccurences ++ ;
				}
			}
		}
		return numberOfOccurences;
	}
}
