
public class dowilo {
    int display(int a ,int b)
        {
            return a+b;//return type
        }
    public static void main(String ... arg) {
        dowilo p=new dowilo();
        int a=10;//arg
        int b=20;//arg
        int result =p.display(a,b); // With arguement and with return type
        System.out.println(result);
    }
}
