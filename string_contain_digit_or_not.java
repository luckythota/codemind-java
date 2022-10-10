import java.util.Scanner;
class digit
{
    public static void main(String args[])
    {
        String s;
        int i,c=0,flag=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(i=0; i<s.length(); i++)
        {
           ch=s.charAt(i);
           if(ch>='0' && ch<='9')
           {
               c++;
               flag=1;
           }
        }
        if(flag==1)
        {
         System.out.print("Contains"+" "+c+" "+"digit");
        }
        else
        {
            System.out.print("Doesn't contain digit");
        }
    }
}