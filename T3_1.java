//1.Write a java program to create a class student having following data members roll no, name, sub1, sub2, sub3. Display the roll no and total marks of student using the concept of class and object. 
import java.util.*;

class student {
	String name;
	int roll_no, sub1, sub2, sub3;
	Scanner ob = new Scanner(System.in);

	void insert() {
		System.out.println("Enter name :");
		name = ob.nextLine();
		System.out.println("Enter Roll_no :");
		roll_no = ob.nextInt();
		System.out.println("Enter first subject marks:");
		sub1 = ob.nextInt();
		System.out.println("Enter second subject marks:");
		sub2 = ob.nextInt();
		System.out.println("Enter third subject marks:");
		sub3 = ob.nextInt();
	}

	void display() {
		// int total = 0;
		System.out.println("Roll_no" + roll_no);
		System.out.println("Name:" + name);
		System.out.println("Subject 1 marks :" + sub1);
		System.out.println("Subject 2 marks :" + sub2);
		System.out.println("Subject 3 marks :" + sub3);
	}
}

class sample {
	public static void main(String[] args) {
		student ob2 = new student();
		// display ob2 = new display();
		ob2.insert();
		ob2.display();
	}
}
