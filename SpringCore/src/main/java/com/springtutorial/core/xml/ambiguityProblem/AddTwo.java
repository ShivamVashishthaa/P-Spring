package com.springtutorial.core.xml.ambiguityProblem;

public class AddTwo {
	private int a;
	private int b;

	public AddTwo(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public AddTwo(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public AddTwo(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
	}

	public void doSum() {
		System.out.println("sum is " + (this.a + this.b));
	}
}
