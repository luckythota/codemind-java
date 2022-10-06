import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        int n,r,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        System.out.println(sum);
    }
}