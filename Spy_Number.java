import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int n,i,r,temp,sum=0,pro=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
            pro=pro*r;
        }
        if(sum==pro)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}