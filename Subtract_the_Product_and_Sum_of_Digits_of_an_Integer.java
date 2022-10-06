import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int n,i,r,sum=0,pro=1,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
            pro=pro*r;
        }
        k=pro-sum;
        System.out.println(k);
            
    }
}