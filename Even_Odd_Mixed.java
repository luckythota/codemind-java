import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        int n,r,ec=0,oc=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            if(r%2==0)
            {
                ec++;
            }
            else
            {
                oc++;
            }
            n=n/10;
        }
        if(oc==0)
        {
            System.out.print("Even");
        }
        else if(ec==0)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}