import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        int l,n,i,w,h;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l || h<l)
            {
                System.out.print("UPLOAD ANOTHER
");
            }
            if(w>=l & h>=l)
            {
                if(w==h)
                {
                    System.out.print("ACCEPTED
");
                }
                else
                {
                    System.out.print("CROP IT
");
                }
            }
        }
    }
}