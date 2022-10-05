import java.util.Scanner;
class evenodd  
{
   public static void main(String args[])
   {
      char n;
      Scanner sc = new Scanner(System.in);
      n=sc.next().charAt(0);
      if(n=='A' || n=='E' || n=='I' || n=='O' || n=='U' || n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
      {
          System.out.println("Vowel");
      }
      else
      {
         System.out.println("Consonant");
      }
   }
}