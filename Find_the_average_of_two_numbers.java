import java.util.Scanner;
class multi
{
   public static void main(String args[])
   {
       int m,n;
       double avg;
       Scanner sc=new Scanner(System.in);
       m=sc.nextInt();
       n=sc.nextInt();
       avg=(m+n)/2.0;
       System.out.format("%.4f",avg);
       
   }
}
