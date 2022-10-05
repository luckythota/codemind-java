import java.util.Scanner;
class Asciivalue
{
   public static void main(String args[])
   {
       char ch;
       Scanner sc=new Scanner(System.in);
       ch=sc.next().charAt(0);
       int asciivalue=ch;
       System.out.println(asciivalue);
       
   }
}