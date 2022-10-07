import java.util.Scanner;
class largest
{
    public static void main(String args[])
    {
        int n,r,s,t,sum=0,sum1=0,v;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=n*n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        v=sum*sum;
        while(v!=0)
        {
            t=v%10;
            v=v/10;
            sum1=sum1*10+t;
        }
        if(sum1==s)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}