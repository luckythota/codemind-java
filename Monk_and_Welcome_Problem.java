import java.util.Scanner;
class monk
{
    public static void main(String args[])
    {
    int n,i,j,k=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int []a=new int[n];
    int []b=new int[n];
    int []c=new int[n];
    for(i=0; i<n; i++)
    {
        a[i]=sc.nextInt();
    }
    for(j=0; j<n; j++)
    {
        b[j]=sc.nextInt();
    }
    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {
           if(i==j)
           {
               c[k]=a[i]+b[j];
           }
        }
        System.out.print(c[k]+" ");
    }
}
    
    
}