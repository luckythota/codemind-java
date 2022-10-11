import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n-1; i>=0; i--)
        {
            for(j=i; j>=0; j--)
            {
                System.out.printf("%c ",i+65);
            }
            System.out.println();
        }
    }
}