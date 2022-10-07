import java.util.Scanner;
class gcd
{
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            {
                n=n-m;
            }
        }
        System.out.println(n);
    }
}