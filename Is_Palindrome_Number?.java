import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int n,r,m,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(sum==m)
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
        
        
    }
}