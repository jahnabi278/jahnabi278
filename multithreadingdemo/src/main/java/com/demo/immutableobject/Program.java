package com.demo.immutableobject;

public class Program {

	public static void main(String[] args) {
		ImmutableRGB immutable = new ImmutableRGB(213, 155, 186, "yellow");
		System.out.println(immutable.getRGB());
		System.out.println(immutable.getName());
		System.out.println(immutable.invert());
	}

}
