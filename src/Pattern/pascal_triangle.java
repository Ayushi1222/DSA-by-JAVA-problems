package Pattern;
import java.util.Scanner;
public class pascal_triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a=a*(i-j)/j;
            }
            System.out.println();
        }
    }
}
