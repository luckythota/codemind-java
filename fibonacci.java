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
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}