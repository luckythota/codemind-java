import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int n,i,r,temp,sum=0,pro=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n*n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}