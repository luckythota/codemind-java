import java.util.Scanner;
class monk
{
    public static void main(String args[])
    {
    int n,i,j,k=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int []a=new int[n];
    for(i=0; i<n; i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0; i<n; i++)
    {
        for(j=i+1; j<n; j++)
        {
           if(a[i]==a[j])
           {
               System.out.println(a[i]);
           }
        }
    }
}
    
    
}