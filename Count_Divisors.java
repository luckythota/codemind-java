import java.util.Scanner;
class grades 
{
   public static void main(String args[])
   {
      int h,s,sp,count=0,i=1;
      Scanner sc = new Scanner(System.in);
      h=sc.nextInt();
      s=sc.nextInt();
      sp=sc.nextInt();
      for(i=h; i<s+1; i++)
      {
          if(i%sp==0)
          {
              count++;
          }
      }
      System.out.println(count);
      
   }
}