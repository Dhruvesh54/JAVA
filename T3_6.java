//6.Create a java program that shows the concept of argument pass by reference.
class demo{
    int a =10;
    void change(demo b){
        b.a = b.a+11;
    }
    public static void main(String args[]){
        demo b = new demo();
        System.out.println("Before by reference:"+b.a);
        b.change(b);
        System.out.println("After by reference:"+b.a);
    }
}