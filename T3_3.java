/*3.Write a java program that defines the class circle with two constructors.
(i) Accept the value of radius of circle. 
(ii)Accept two value of a coordinate point of circle and display their value.
*/
import java.util.*;
class circle{
	double area;
	int coX,coY,r;
	circle(double r){
		area=3.14*r*r;
		displayArea();
	}

	void displayArea(){
		System.out.println("area of circle is:"+area);
	}

	circle(int x,int y){
		coX=x;
		coY=y;
		displayCor();
	}
	
	void displayCor(){
		System.out.println("value of co-ordinet x:"+coX);
		System.out.println("value of oc-ordinet x:"+coY);
	}
}
class t3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,a,b;
		System.out.println("Enter radius of circle");
		r=sc.nextInt();
		System.out.println("Enter X oc-ordinet");
		a=sc.nextInt();
		System.out.println("Enter Y oc-ordinet");
		b=sc.nextInt();
		circle c1 = new circle(r);
		circle c2 = new circle(a,b);
	}
	
}
