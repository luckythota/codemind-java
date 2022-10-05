import java.util.Scanner;
class area  
{
   public static void main(String args[])
   {
      int radius;
      double pi=3.14,area;
      Scanner sc = new Scanner(System.in);
      radius = sc.nextInt();
      area = (radius*radius)*pi;
      System.out.println(area);
   }
}