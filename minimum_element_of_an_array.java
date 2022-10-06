import java.util.Scanner;
class element
{
    public static void main(String args[])
    {
        int n,i,min;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=0; i<n; i++)
        {
             if(min>a[i])
             {
                 min=a[i];
             }
        }
        System.out.println(min);
    }
}