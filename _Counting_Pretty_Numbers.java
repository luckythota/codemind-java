import java.util.Scanner;
class pretty
{
    public static void main(String args[])
    {
        int t,n,o,i,j,r=0,count;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0; i<t; i++)
        {
            n=sc.nextInt();
            o=sc.nextInt();
            count=0;
            for(j=n; j<=o; j++)
            {
                if(j!=0)
                {
                    r=j%10;
                }
                if(r==2 || r==3 || r==5)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}