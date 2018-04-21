package com.FaysalTask9;

public class RotateTester {
	public static void main(String[] args) {
		int[] linear = { 1, 4, 8, 16, 25, 36, 49, 64, 81, 100 };

		Rotate obj = new Rotate();
		System.out.println("Array after left rotating:");
		obj.RotateLeft(linear, 4);
		System.out.println("\nArray after right rotating:");
		obj.RotateRight(linear, 4);
	}
}