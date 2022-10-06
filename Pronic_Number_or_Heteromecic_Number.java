import java.util.Scanner;
class pronic
{
    public static void main(String args[])
    {
        int n,i,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1; i<n; i++)
        {
            if(n==(i*(i+1)))
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}