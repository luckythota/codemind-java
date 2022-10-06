import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        int n,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n%2==0)
        {
            n=n/2;
        }
        if(n==1)
        {
            flag=1;
        }
        while(n%3==0)
        {
            n=n/3;
        }
        if(n==1)
        {
            flag=1;
        }
        while(n%5==0)
        {
            n=n/5;
        }
        if(n==1)
        {
            flag=1;
        }
        if(flag==1)
        {
            System.out.print("Ugly Number");
        }
        else
        {
            System.out.print("Not Ugly Number");
        }
        
    }
}