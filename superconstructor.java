class A5
{
    A5()
    {
        System.out.println("Good morning");
    }
}
class B5 extends A5
{
    B5()
    {
        super();
        System.out.println("Good afternoon");
    }
}

public class superconstructor {
    public static void main(String[] args) {
        B5 b = new B5();
    }
}
