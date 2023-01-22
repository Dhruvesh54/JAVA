/*3)write a java program that usies narrowing conversion.*/

class t1_3 {
	public static void main(String[] args) {
		double d = 100.88;
		long l = (long) d;
		int i = (int) l;
		System.out.println("double" + d);
		System.out.println("long" + l);
		System.out.println("int" + i);
	}
}