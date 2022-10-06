import java.util.Scanner;
class diagonal
{
    public static void main(String args[])
    {
        int c;
        double f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=(1.8*c)+32;
        System.out.format("%.2f",f);
    }
}