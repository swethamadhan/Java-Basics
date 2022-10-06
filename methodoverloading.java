public class methodoverloading {
    void area(int r)
    {
        System.out.println( r * r );
    }
    void area(int l, int b)
    {
        System.out.println(l*b);
    }
    public static void main(String[] args) {
        methodoverloading r = new methodoverloading();
        r.area(5);
        r.area(4,5);
    }
}
