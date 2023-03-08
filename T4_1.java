//1.Write a java application that implements the concept of method overloading.
class T4_1 {
    public void print() {
        System.out.println("print with no args");
    }

    public void print(int a) {
        System.out.println("print with one integer arg");
    }

    public void print(int a, int b) {
        System.out.println("print with 2 int args");
    }

    public static void main(String[] args) {
        T4_1 obj = new T4_1();
        obj.print();
        obj.print(1);
        obj.print(1, 2);
    }
}