Non-static


Non static members are of type non static variable, non static block, non static user method, constructor. To access these 4 types we need object and the object can be created in main method, static block, user defined method.


package com.bini.babu;

public class NonStaticMembersDemo {

	NonStaticMembersDemo(){
		System.out.println("Inside the constructor");
	}
	
	{
		System.out.println("Inside non-static-block");
	}
	
	public static void main(String[] args) {
                System.out.println("Inside main block");
                new NonStaticMembersDemo();
	}

}



Output

Inside main block
Inside non-static-block
Inside the constructor



constructor (i.e  NonStaticMembersDemo(){System.out.println("Inside the constructor");} ) , (i.e  non-static block { System.out.println("Inside non-static-block"); } ), access the non static members call the non static members in main function by new keyword ( i.e   new NonStaticMembersDemo(); ) when creating instance of the object  ( i.e   new NonStaticMembersDemo(); ) then non-static block will be executed before constructor. The nonstatic constructor and nonstatic block will be called each time when the instance is called each time when an instance is created in main function  ( i.e   new NonStaticMembersDemo(); ).
But static members are called only once when the class is invoked.




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




Output

Inside static-block
Inside main block
Inside non-static-block
Inside the constructor
Inside non-static-block
Inside the constructor
Inside non-static-block
Inside the constructor




In the code below constructor (here  i.e NonStaticMembersDemo() {System.out.println("Inside the constructor");} ) is not there when an instance is created in the main function ( i.e   new NonStaticMembersDemo(); ) and when we compile the java program no compilation error comes , as well compiler doesn't see any constructor ( shown in the below code) then the compiler will inject a default constructor.
Hence the output will be as follows. In additionally you cannot see this piece of code  ( System.out.println("Inside the constructor"); ) and in output (i.e Inside the constructor) because the default constructor injected by the compiler does not have this 'System.out.println("Inside the constructor");'.



package com.bini.babu;

public class NonStaticMembersDemo {

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




Output

Inside static-block
Inside main block
Inside non-static-block
Inside non-static-block
Inside non-static-block
