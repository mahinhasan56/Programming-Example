package com.FaysalTask9;

public class Rotate {
	Object[] data;

	public static void RotateLeft(int array[], int x) {
		for (int i = 0; i < x; i++) {
			int temp = array[0];
			for (int j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[array.length - 1] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void RotateRight(int array[], int x) {
		for (int p = 0; p < x; p++) {
			int temp = array[array.length - 1];
			for (int i = array.length - 1, j = i - 1; i > 0; i--, j--) {
				array[i] = array[j];
			}
			array[0] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
