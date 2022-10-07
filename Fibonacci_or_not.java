import java.util.Scanner;
class fibanocci
{
    public static void main(String args[])
    {
        int a,b,i,c,n,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=0;
        b=1;
        for(i=1; i<=n; i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(n==c)
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}