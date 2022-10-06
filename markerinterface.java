interface parking
{
    public void show();
}
class P implements parking
{

}
class Q
{

}
public class markerinterface {
    public static void main(String[] args) {
        Q x = new Q();
        if(x instanceof parking )
        {
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not allowed");
        }
    }
}
