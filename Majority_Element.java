import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int n,i,j,count=0,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            count=0;
            flag=0;
            for(j=0; j<n; j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count>(n/2))
            {
                    flag=1;
                    System.out.println(a[i]);
                    a[i]=0;
            }
        }
        
    }
}