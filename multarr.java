import java.util.Scanner;

public class multarr {
    public static void main(String... args) {
        int a[][]=new int[2][2];
        Scanner s = new Scanner(System.in);

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
