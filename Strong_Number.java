import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        int n,i,r,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            int fact=1;
            for(i=1; i<=r; i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("The number"+" "+temp+" " +"is a strong number");
        }
        else
        {
            System.out.print("The number"+" "+temp+" "+"is not a strong number");
        }
    }
}