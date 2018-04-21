package com.FaysalTask2;

public class Vehicle {
	public int x = 0, y = 0;

	public int moveUp() {
		return y = y + 1;
	}

	public int moveLeft() {
		return x = x - 1;
	}

	public int moveDown() {
		return y = y - 1;
	}

	public int moveRight() {
		return x = x + 1;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
