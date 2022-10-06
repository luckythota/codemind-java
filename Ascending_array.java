import java.util.Scanner;
class countpalindrome
{
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<n-1; i++)
        {
            if(a[i]<a[i+1])
            {
                c+=1;
            }
        }
        if(n-1==c)
        {
           System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        
    }
}