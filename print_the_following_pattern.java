import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(i==j || i==n-j-1)
                {
                    System.out.print("x"+"");
                }
                else
                {
                    System.out.print("0"+"");
                }
            }
                System.out.println();
        }
        
        
    }
}