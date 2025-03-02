package practice;

public class Assignment1 {	
	
	//variables
	int rollno;
	
	String studentName;
	
	//Methods
	public void method1 ()
	{
		System.out.println("This is Student 1 "+ studentName);
		System.out.println("Roll no is "+ rollno);

	}
	
	public void method2 ()
	{

		System.out.println("This is Student 2 "+ studentName);
		System.out.println("Roll no is "+ rollno);
	}
	//Main Method
	public static void main(String[] args) {
		
		//object creation 1
		Assignment1 objRef1 = new Assignment1();
		
		objRef1.rollno=1;
		objRef1.studentName="Sujit";
		
		//method calling
        objRef1.method1();

		
		System.out.println("-----------------------------");

		objRef1.rollno=2;
		objRef1.studentName="Aman";
		
	
		//method calling
        objRef1.method2();

	}

}
