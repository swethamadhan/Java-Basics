public class annarrret {
    int[] display()
    {
        return new int[] {1,2,3,4};
    }

    public static void main(String ... arg) {
        annarrret p= new annarrret();
        int d[] = p.display();
        for(int i:d)
        {
            System.out.println(i);
        }
    }
}
