import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int n,sum=0,r,s,sum1=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            if(n>1)
            {
                r=n%10;
                n=n/10;
                sum=sum+r;
            }
            if(sum>=10)
            {
                s=sum%10;
                sum=sum/10;
                sum=sum+s;
            }
        }
        System.out.println(sum);
        
    }
}