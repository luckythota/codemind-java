import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        int n,i,j,ec=0,oc=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for(i=0; i<n; i++)
        {
                a[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
           if(a[i]%2==0)
           {
               ec++;
           }
           else
           {
               oc++;
           }
        }
        System.out.print(ec+" "+oc+" ");
        
    }
}