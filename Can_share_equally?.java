import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        if(x==0 && y%2==0)
        {
            System.out.print("YES");
        }
        else if(x==0 && y%2!=0)
        {
            System.out.print("NO");
        }
        else if((x+(2*y))%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
        
    }
}