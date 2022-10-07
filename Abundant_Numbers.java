import java.util.Scanner;
class fibanocci
{
    public static void main(String args[])
    {
        int n,i,sum=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}