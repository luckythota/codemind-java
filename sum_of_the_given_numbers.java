import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        int t,i,m,n,sum=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0; i<t; i++)
        {
            m=sc.nextInt();
            n=sc.nextInt();
            sum=m+n;
            System.out.println(sum);
        }
    }
}