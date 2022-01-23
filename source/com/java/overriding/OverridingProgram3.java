package com.java.overriding;

// Java program to show that
// if the static method is redefined by
// a derived class, then it is not
// overriding, it is hiding

class Parent3 {
	// Static method in base class
	// which will be hidden in subclass
	static void m1()
	{
		System.out.println("From Parent3 "
						+ "static m1()");
	}

	// Non-static method which will
	// be overridden in derived class
	void m2()
	{
		System.out.println("From Parent3 "
						+ "non-static(instance) m2()");
	}
}

class Child3 extends Parent3 {
	// This method hides m1() in Parent3
	static void m1()
	{
		System.out.println("From Child3 static m1()");
	}

	// This method overrides m2() in Parent3
	@Override
	public void m2()
	{
		System.out.println("From Child3 "
						+ "non-static(instance) m2()");
	}
}

// Driver class
class OverridingProgram3 {
	public static void main(String[] args)
	{
		Parent3 obj1 = new Child3();

		// As per overriding rules this
		// should call to class Child3 static
		// overridden method. Since static
		// method can not be overridden, it
		// calls Parent3's m1()
		obj1.m1();

		// Here overriding works
		// and Child3's m2() is called
		obj1.m2();
	}
}
