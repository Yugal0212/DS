//4. Create class Employee_Detail with attributes Employee_ID, Name, Designation, 
// and Salary. Write a program to read the detail from user and print it. 

import java.util.Scanner;

class Employee_Detail {
	int Employee_ID;
	String Name;
	String Designation;
	int Salary;

	void detail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		Name = sc.next();
		System.out.println("enter employee id");
		Employee_ID = sc.nextInt();
		System.out.println("enter designation");
		Designation = sc.next();
		System.out.println("enter salary :-");
		Salary = sc.nextInt();
	}

	void display() {
		System.out.println("Name is" + Name);
		System.out.println("Employee id is" + Employee_ID);
		System.out.println("designation is" + Designation);
		System.out.println("salary" + Salary);
	}
}

public class Lab6_34 {
	public static void main(String[] args) {
		Employee_Detail e = new Employee_Detail();
		e.detail();
		e.display();

	}
}
