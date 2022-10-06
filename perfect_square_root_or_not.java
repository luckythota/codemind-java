import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        int n,i,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1; i<n; i++)
        {
            if(n==(i*i))
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