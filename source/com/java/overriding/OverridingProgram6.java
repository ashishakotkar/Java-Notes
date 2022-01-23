package com.java.overriding;

//Java program to demonstrate overriding when
//superclass method does declare an exception

class Parent6 {
	void m1() throws RuntimeException
	{
		System.out.println("From parent m1()");
	}
}

class Child6 extends Parent6 {
	@Override
	// no issue while throwing same exception
	void m1() throws RuntimeException
	{
		System.out.println("From child1 m1()");
	}
}
class Child7 extends Parent6 {
	@Override
	// no issue while throwing subclass exception
	void m1() throws ArithmeticException
	{
		System.out.println("From child2 m1()");
	}
}
class Child8 extends Parent6 {
	@Override
	// no issue while not throwing any exception
	void m1()
	{
		System.out.println("From child3 m1()");
	}
}
class Child9 extends Parent6 {
	@Override
	// compile-time error
	// issue while throwing parent exception
	void m1() throws Exception
	{
		System.out.println("From child4 m1()");
	}
}

