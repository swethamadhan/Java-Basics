interface A7
{
    public void show();
    
}
interface B7
{
    public void display();

}
class M implements A7,B7
{
    public void show()
    {
        System.out.println("Good mornig");
    }
    public void display()
    {
        System.out.println("Good afternoon");
    }
}
public class multipleinterface {
    public static void main(String[] args) {
        M h= new M();
        h.show();
        h.display();
    }
}
