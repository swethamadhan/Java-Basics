class A
{
    void move()
    {
        System.out.println("Hello");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Adhi");
    }
}
class C extends B
{

}
public class inheritance {
    public static void main(String[] args) {
        B x = new B();
        x.move();
        x.show();
    }
}
