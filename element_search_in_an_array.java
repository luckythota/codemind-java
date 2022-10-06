import java.util.Scanner;
class element
{
    public static void main(String args[])
    {
        int n,i,k,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0; i<n; i++)
        {
            if(a[i]==k)
            {
                flag=1;
            }

        }
        if(flag==1)
        {
          System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}