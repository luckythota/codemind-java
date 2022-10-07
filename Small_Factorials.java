import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        int t,n,i,j,fact;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0; i<t; i++)
        {
            n=sc.nextInt();
            fact=1;
            for(j=1; j<=n; j++)
            {
                fact=fact*j;
            }
            System.out.println(fact);
        }
    }
}