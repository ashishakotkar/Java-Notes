//Example of covariant return type

package com.java.overriding;

class AA{
	
}

class BB extends AA{
	
}

class Base5{
	AA display() {
		System.out.println("I am in Base class");
		return new AA();
	}
	
}

class Derived5 extends Base5{
	BB display() {
		System.out.println("I am in Derived class");
		return new BB();
	}
	
}

public class OverridingProgram5 {
	public static void main(String[] args) {
		Base5 base = new Derived5();
		base.display();	
	}

}
