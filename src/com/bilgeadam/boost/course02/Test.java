package com.bilgeadam.boost.course02;

public class Test {

	public static void main(String[] args) {
		Doable d1 = new IWillDoIt();
		Doable d2 = new IAlsoWillDoIt();
		
		d1.alwaysDoIt();
		d2.alwaysDoIt();

	}

}
