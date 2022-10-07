import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int  n,i,count=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}