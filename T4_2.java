//2.Write a java application that implements the concept of method overriding.
class sample {
    public void set() {
        System.out.println("set method of sample class");
    }
}

class sample2 extends sample {
    public void set() {
        System.out.println("set method of sample2 class");
    }
}

class T4_2 {
    public static void main(String[] args) {
        sample2 obj = new sample2();
        obj.set();
    }
}