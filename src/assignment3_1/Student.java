package assignment3_1; 

public class Student {  //class definition 
	
	public static String college= "GCEK";   //static variable declaration
	
	public String name;       //instance variable declaration
	
	public int rollno;         //instance variable declaration
	
	public int  batchno;         //instance variable declaration

	public void showdetails(Student s) {               //method for showing scope of variable
		
		
		System.out.println("The name of college is " +college + ".");  //static variable once declared has same value over all instance  of classes
		
		System.out.println("The name of student is " +s.name  + ".");
		
		System.out.println("The student roll is  " +s.rollno  + "." );
		
		System.out.println("The student batch no is " +s.batchno  + ".");
		
		System.out.println(" ");
		
	
	}
	
	public static void main(String args[])    //main methods start here 
	{
		
		Student s1=new Student();   //object 1 is created 
		Student s2=new Student();   //object 2 is created
		
		s1.name="Aditya";   //instant variables instantiated for object 1
		s1.rollno=55;
		s1.batchno=2;
		
		s1.showdetails(s1);      
		
		s2.name="Pranav";      //instant variables instantiated for object 2
		s2.rollno=58;
		s2.batchno=4;
		s2.showdetails(s2);		
	}
}
	

