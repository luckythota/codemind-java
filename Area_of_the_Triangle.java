import java.util.Scanner;
class Areaoftriangle
{
   public static void main(String args[])
   {
       int a,b,c;
       double sem,area;
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       sem=(a+b+c)/2.0;
       area=Math.sqrt(sem*(sem-a)*(sem-b)*(sem-c));
       System.out.format("%.2f",area);
       
   }
}