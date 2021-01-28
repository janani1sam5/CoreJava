package org.exception.com;

public class TackTryCatch {

	public static void main(String args[]) {
		// Nested Try, Catch and Finally
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
