//ecluid algo se solve kiya h
import java.util.Scanner;
class GCD2
{
    static int gcd2(int x,int y)
    {
        if(y==0)
        {
            return x;
        }
        return gcd2(y,x%y);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x integer");
        int x=sc.nextInt();
        System.out.println("enter the y integer");
        int y=sc.nextInt();
        System.out.println(gcd2(x,y));
    }
}