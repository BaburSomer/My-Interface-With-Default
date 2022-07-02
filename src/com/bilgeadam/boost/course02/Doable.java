package com.bilgeadam.boost.course02;

public interface Doable {
	int blaBla = 1;  // (sadece public static final tanımlamaya izin veriyor)
	
	void doIt();
	int makeIt(int abc);
	boolean isPossible();
	default void alwaysDoIt() {
		
		System.out.println("yeah");
	}
	void test();
}
