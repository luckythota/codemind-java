import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int m,n,r,sum=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        if(m==sum)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}