import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int a1,a2,a3,b1,b2,b3,i,ac=0,bc=0;
        Scanner sc=new Scanner(System.in);
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        b1=sc.nextInt();
        b2=sc.nextInt();
        b3=sc.nextInt();
        if(a1>b1)
        {
            ac++;
        }
        else if(a1<b1)
        {
            bc++;
        }
        if(a2>b2)
        {
            ac++;
        }
        else if(a2<b2)
        {
            bc++;
        }
        if(a3>b3)
        {
            ac++;
        }
        else if(a3<b3)
        {
            bc++;
        }
        System.out.print(ac+" "+bc+" ");
        
    }
}