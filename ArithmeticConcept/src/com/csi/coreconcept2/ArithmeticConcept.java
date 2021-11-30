package com.csi.coreconcept2;

public class ArithmeticConcept {
	public static void main(String[] args) {
		ArithmeticConcept a1 = new ArithmeticConcept();
		a1.add(11, 20);
		System.out.println("\n sub is " + sub(11, 20));
		System.out.println("\n " + a1.mul(11, 20));
		System.out.println("\n " + a1.div(11, 20));
	}

	void add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(+result);
	}

	static int sub(int n1, int n2) {
		return n1 - n2;
	}

	double mul(double n1, double n2) {
		return n1 * n2;
	}

	double div(int n1, int n2) {
		return n1 / n2;
	}

}
