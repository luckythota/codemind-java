import java.util.Scanner;
class element
{
    public static void main(String args[])
    {
        int n,i,k,v,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        v=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(a[i]>=k && a[i]<=v)
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}