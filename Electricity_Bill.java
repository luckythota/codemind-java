import java.util.Scanner;
class electricity
{
    public static void main(String args[])
    {
        String s1,s2;
        int n;
        double charge=0,k=0,v=0,g;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        n=sc.nextInt();
        if(n<=199)
        {
            charge=n*1.20;
        }
        else if(n>=200 && n<400)
        {
            charge=n*1.50;
        }
        else if(n>=400 && n<600)
        {
            charge=n*1.80;
        }
        else
        {
            charge=n*2.00;
        }
        g=charge*(0.15);
        if(charge>400)
        {
            v=charge+g;
        }
        else
        {
            v=charge+100;
        }
        System.out.format("%.2f",v);
    }
}