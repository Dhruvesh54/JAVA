//2.Create a class rectangle that uses variables length and width and a method area() that counts the area of a rectangle and displays its value.
import java.util.*;
	class ractaangle{
		int length,width;
		void insert(int l,int w){
			length=l;
			width=w;
		}
		void area(){
			System.out.println("Area of ractangle is :"+(length*width));
		}
	}
class t2_2{
	public static void main(String[] args) {
		int l,w;
		Scanner r = new Scanner(System.in);
		System.out.println("enter lenhth:");
		l=r.nextInt();
		System.out.println("Enter widht:");
		w=r.nextInt();
		ractaangle ob = new ractaangle();
		ob.insert(l,w);
		ob.area();
	}
}