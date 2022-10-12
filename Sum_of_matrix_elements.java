import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        int m,n,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);

    }
}