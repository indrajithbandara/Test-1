package org.configuration.classes;

public class Class2 {

	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int result = add(a, b);
		System.out.print(result);
	}
}
