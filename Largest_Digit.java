import java.util.Scanner;
class largest
{
    public static void main(String args[])
    {
        int n,r,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=0;
        while(n!=0)
        {
            r=n%10;
            if(r>s)
            {
                s=r;
            }
            n=n/10;
        }
        System.out.print(s);
    }
}