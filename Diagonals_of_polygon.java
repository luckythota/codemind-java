import java.util.Scanner;
class diagonal
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=(n*(n-3))/2;
        System.out.println(k);
    }
}