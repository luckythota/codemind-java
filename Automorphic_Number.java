import java.util.Scanner;
class automorphic
{
    public static void main(String args[])
    {
        int m,n,r,s,temp,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        temp=10;
        s=n*n;
        while(n>0)
        {
            r=s%temp;
            if(m==r)
            {
                flag=1;
                break;
            }
            n=n/10;
            temp=temp*10;
        }
        if(flag==1)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
    }
}