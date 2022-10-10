import java.util.Scanner;
class digit
{
    public static void main(String args[])
    {
        String s;
        int i,c=0,ck;
        char k;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(i=0; i<s.length(); i++)
        {
            k=s.charAt(i);
           if(k>='0' && k<='9')
           {
               c=c+(k-'0');
           }
        }
        System.out.print(c);
    }
}