package com.firecode;
import com.util.Util;

/**
 * You are given an m x n 2D image matrix where each integer represents a pixel.
 * Flip it in-place along its horizontal axis.
 */
public class HorizontalFlip {
	public static void flipHorizontalAxis(int[][] matrix) {
		// Number of rows
		int size = matrix.length;
		for(int i = 0; i < size / 2; i++) {
			int[] temp = matrix[i];
			matrix[i] = matrix[size - i - 1];
			matrix[size - i - 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{{2, 3}, {4, 5}};
		
		for(int i = 0; i < matrix.length; i++) {
			Util.printArray(matrix[i]);
		}
		
		flipHorizontalAxis(matrix);

		for(int i = 0; i < matrix.length; i++) {
			Util.printArray(matrix[i]);
		}
		
		matrix = new int[][]{{2, 3}, {4, 5}, {6,7}};
		
		for(int i = 0; i < matrix.length; i++) {
			Util.printArray(matrix[i]);
		}
		
		flipHorizontalAxis(matrix);

		for(int i = 0; i < matrix.length; i++) {
			Util.printArray(matrix[i]);
		}		
		
	}
}
