package com.bini.babu;

public class NonStaticMembersDemo {

	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

	{
		System.out.println("Inside non-static-block");
	}

	public static void main(String[] args) {
		System.out.println("Inside main block");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}

	static {
		System.out.println("Inside static-block");
	}
}
