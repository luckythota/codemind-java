import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char ch;
        int i,c=0;
        for(i=0; i<s.length(); i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                c++;
            }
        }
        System.out.println(c+1);
        
    }
}