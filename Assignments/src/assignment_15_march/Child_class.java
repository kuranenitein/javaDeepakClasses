package assignment_15_march;

public class Child_class extends Parent_class {
	
	

	 Child_class() {
		 this(1,2,3);
		 System.out.println("I am child class default constructor");
		}
	 
	 Child_class(int a) {
		 this();
		 System.out.println("I am child class one parameter constructor");
		}

	 
	 Child_class(int a, int b	) {
		 this(1);
		 System.out.println("I am child class two parameter constructor");
		}
	 
	 Child_class(int a, int b, int c) {
		 super(1);
		 System.out.println("I am child class three parameter constructor");
		}

	

	public static void main(String[] args) {
		
		Child_class ch_obj = new Child_class(1,2);

	}

}
