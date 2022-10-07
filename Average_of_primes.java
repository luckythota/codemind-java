import java.util.Scanner;
class primes
{
    public static void main(String args[])
    {
        int n,i,k,m,j,count=0,c=0;
        float sum=0, v=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            count=0;
            m=a[i];
            for(j=1; j<=m; j++)
            {
                if(m%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                sum=sum+m;
                c=c+1;
            }
        }
        v=sum/c;
        System.out.format("%.2f",v);
    }
}