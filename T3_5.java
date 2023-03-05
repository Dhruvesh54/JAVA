//5.Create a java program that shows the concept of argument pass by value.
class demo{
    int a=100;
    void change(demo b){
        b.a= b.a+10;
    }
public static void main(String args[]){
    demo b = new demo();
    System.out.println("value (before change):"+b.a);
    b.change(b);
    System.out.println("value (after change):"+b.a);
    }
}