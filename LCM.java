import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int m,n,i=1;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        i=1;
        while(m*i%n!=0)
        {
            i++;
        }
        System.out.println(m*i);
    }
}