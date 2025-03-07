package practice;

public class Assignment2 {	
	//Assignments Day 3 Notes	
	//Statement 1 -- ((((((10+2)+2)-2)*2)/2)
	//Statement 2 -- ((((10-2)+2)*2)-2)/2)	

	//Create method 1 for addition of two values( 2 inputs + 1 Output )
	public int add(int a, int b)
	{return (a+b) ;}
	
	//Create method 2 for substraction of two values( 2 inputs + 1 Output )
	public int sub(int a, int b)
	{ return (a-b) ;}
	
	//Create method 3 for multiplication of two values( 2 inputs + 1 Output )
	public int multi(int a, int b)
	{ return (a*b); }
	
	//Create method 4 for division of two values( 2 inputs + 1 Output )
	public int div(int a, int b)
	{ return (a/b); }	

	public static void main(String[] args) {		
		//Obj ref variable creation
		Assignment2 obj = new Assignment2();
		
		//Statement 1 -- ((((((10+2)+2)-2)*2)/2)
		int p = obj.add(10, 2);
		int q = obj.add(p, 2);
		int r = obj.sub(q, 2);
		int s = obj.multi(r, 2);		
		System.out.println("Statement 1 result is " + (obj.div(s, 2)));
		
		//Statement 2 -- ((((10-2)+2)*2)-2)/2)		
		int m = obj.sub(10, 2);
		int n = obj.add(m, 2);
		int o = obj.multi(n, 2);
		int i = obj.sub(o, 2);
		
		System.out.println("Statement 2 result is " + (obj.div(i, 2)));
		

	}

}
