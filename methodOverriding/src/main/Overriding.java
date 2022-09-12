package main;

 class Parent {
	int result;
	 private void add (int var1, int var2) { // Method is private, class purpose only
		  result = var1 + var2;
		  System.out.println("Addition of two value is : " + result);
	  }
	 protected void subtraction (int var1, int var2) {   // Method is protected if inherited by another then that class can be use this method.
		 result = var1 - var2;
		  System.out.println("subtraction of two value is : " + result);
	  }
}
class Child extends Parent{
	int result;
	private void add (int var1, int var2) {    // This method is private you cannot call from another class
		  result = var1 + var2;
		  System.out.println("Adition of two value is : " + result);
	  }
	@Override 		// Override the method from super class.
	protected void subtraction(int var1, int var2) {  // if you override the method you can modify the method.
			result = var2 - var1;
	//	super.subtraction(var1, var2);
		System.out.println("subtraction of two numbbers is :" + result);
	}
}

public class Overriding{				// Main class.
	public static void main(String[] args) {  // Main method.
		Parent var1 = new Parent();   // Create object for the Parent class.
		var1.subtraction(30,4);		  // call parent class method.
		Parent var2 = new Child();	  // Create Child object reference of Parent class.
	    var2.subtraction(90,5);		  // Call subtraction method.
	}
}