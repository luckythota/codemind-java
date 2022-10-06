import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        int m,n,i,sum=0,sum1=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=1; i<m; i++)
        {
            if(m%i==0)
            {
                sum=sum+i;
            }
        }
        for(i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum1=sum1+i;
            }
        }
        if(m==sum1 && n==sum)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}