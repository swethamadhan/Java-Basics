public class anonarr {
    void display (int a[])
    {
        for(int i:a)
            System.out.println(i);
    }
    public static void main(String... arg) {
        anonarr p= new anonarr();
        p.display(new int[] {1,2,3,4});
    }
}
