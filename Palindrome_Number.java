import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int t,n,temp,i,r,sum;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0; i<t; i++)
        {
            n=sc.nextInt();
            temp=n;
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum*10+r;
                n=n/10;
            }
            if(sum==temp)
            {
               System.out.print("True
");
            }
            else
            {
                System.out.print("False
");
            }
        }
    }
}