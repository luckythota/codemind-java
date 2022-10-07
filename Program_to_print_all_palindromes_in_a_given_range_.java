import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        int x,y,m,i,r;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int num1=0;
        int sum=0;
        for(i=x; i<y; i++)
        {
           num1=i;
           sum=0;
           while(num1!=0)
            {
                r=num1%10;
                num1=num1/10;
                sum=sum*10+r;
            }
            if(i==sum)
            {
                System.out.print(i+" ");
            }
        }
        
        
    }
}