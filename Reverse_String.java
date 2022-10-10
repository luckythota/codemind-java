import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        String s,n;
        int i;
        char c;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        n=" ";
        for(i=0; i<s.length(); i++)
        {
            c=s.charAt(i);
            n=c+n;
        }
        System.out.print(n);
    }
}