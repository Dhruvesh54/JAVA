/*4)write a java program to that use scope of variable*/

class scope {
	int a = 20;

	void print() {
		int y = 30;
		System.out.println("value of y is :" + y);
		System.out.println("value of a is :" + a);
	}

	public static void main(String[] args) {
		int i = 10;
		System.out.println("value of i is :" + i);
		scope t = new scope();
		t.print();
	}

}