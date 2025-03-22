package assignment_15_march;

public class Parent_class {
	
	

	 Parent_class() {
		 this(1,2);
		 System.out.println("I am parent class default constructor");
		}
	 
	 Parent_class(int a) {
		 this(1,2,3);
		 System.out.println("I am parent class one parameter constructor");
		}

	 
	 Parent_class(int a, int b) {
		 System.out.println("I am parent class two parameter constructor");
		}

	 
	 Parent_class(int a, int b, int c) {
		 this ();
		 System.out.println("I am parent class three parameter constructor");
		}

}