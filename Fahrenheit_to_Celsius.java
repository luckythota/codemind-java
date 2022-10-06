import java.util.Scanner;
class diagonal
{
    public static void main(String args[])
    {
        int f;
        double c;
        Scanner sc=new Scanner(System.in);
        f=sc.nextInt();
        c=(1/1.8)*(f-32);
        System.out.format("%.2f",c);
    }
}