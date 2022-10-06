import java.util.Scanner;
class element
{
    public static void main(String args[])
    {
        int n,i,v=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(a[n-1]%2!=0)
            {
                v=i;
            }

        }
        System.out.println(v);
    }
}