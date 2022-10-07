import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        int  t,i,m,n,j,flag=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0; i<t; i++)
        {
            n=sc.nextInt();
            m=n;
            flag=0;
            for(j=1; j<=n; j++)
            {
               if(m==j*j)
               {
                   flag=1;
                   break;
               }
            }
            if(flag==1)
            {
                System.out.print("True
");
            }
            else
            {
                System.out.print("False
");
            }
            
        }
    }
}