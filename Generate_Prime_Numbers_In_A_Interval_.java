import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        int a,b,i,j,count;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a; i<b; i++)
        {
            if(i>1)
            {
                count=0;
                for(j=2; j<i; j++)
                {
                  if(i%j==0)
                  {
                     count++;
                   }
                 }
                 if(count==0)
                 {
                    System.out.println(i);
                 }
            }
            
        }
    }
}