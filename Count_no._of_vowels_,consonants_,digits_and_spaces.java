import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int i,g,wc=0,vc=0,cc=0,dc=0;
        for(i=0; i<s.length(); i++)
        {
           g=s.charAt(i);
           if(g=='a' || g=='e' || g=='i' || g=='o' || g=='u')
           {
               vc++;
           }
           else if(g==' ')
           {
               wc++;
           }
           else if(g>='0' && g<='9')
           {
               dc++;
           }
           else
           {
               cc++;
           }
        }
        System.out.print("Vowels: "+vc+"
");
        System.out.println("Consonants: "+cc);
        System.out.println("Digits: "+dc);
        System.out.println("White spaces: "+wc);
        
    }
}