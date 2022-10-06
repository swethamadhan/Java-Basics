class A3
{
    String name = "hello";
}
class B3 extends A3
{
    String name = "hai";
    void show()
    {
        System.out.println(name);
        System.out.println(super.name);// calling the instance of parent class using super keyword
    }
}
public class superkeyword {
    public static void main(String[] args) {
        B3 b = new B3();
        b.show();
    }
}
