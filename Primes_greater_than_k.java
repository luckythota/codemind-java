import java.util.Scanner;
class primes
{
    public static void main(String args[])
    {
        int n,i,k,m,j,sum=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
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
            if(count==2 && a[i]>=k)
            {
                sum=sum+1;
            }
            
        }
        System.out.println(sum);
    }
}