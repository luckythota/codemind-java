import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int m,n,i,sum=0,flag=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
                System.out.print(m+" "+"x"+" "+i+" "+"="+" "+m*i+"
");
            }
        }
    }
}