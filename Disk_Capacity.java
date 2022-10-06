import java.util.Scanner;
class disk
{
    public static void main(String args[])
    {
        int tr,sect,bl,k,v;
        Scanner sc=new Scanner(System.in);
        tr=sc.nextInt();
        sect=sc.nextInt();
        bl=sc.nextInt();
        v=2*tr*sect*bl*512;
        System.out.print(v);
    }
}