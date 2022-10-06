abstract class Green
{
    abstract void A();
    abstract void B();
    void C()
    {
        System.out.println("I am C");
    }
}
abstract class Yellow extends Green
{
    void B()
    {
        System.out.println("I am B");
    }
}
class Blue extends Yellow // concrete class
{
    void A()
    {
        System.out.println("I am A");
    }
}
public class interfacelast {
    public static void main(String[] args) {
        Blue b=new Blue();
        b.A();
        b.B();
        b.C();
    }
}
