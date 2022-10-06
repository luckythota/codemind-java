import java.util.Scanner;
class countpalindrome
{
    public static void main(String args[])
    {
        int n,m,r,i,sum,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            m=a[i];
            sum=0;
            while(a[i]!=0)
            {
                r=a[i]%10;
                a[i]=a[i]/10;
                sum=sum*10+r;
            }
            if(sum==m)
            {
                c+=1;
            }
        }
        System.out.println(c);
        
    }
}