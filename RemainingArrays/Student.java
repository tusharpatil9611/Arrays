package RemainingArrays;

public class Student 
{
	int roll;
	int marks;
	String name;
	 Student(int roll, int marks, String name) 
	{
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	public String toString() 
	{
		return "Student [roll=" + roll + ", marks=" + marks + ", name="
				+ name + "]";
	}
	

}
