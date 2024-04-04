// brute force approach h ye iterative se kiya h
import java.util.Scanner;
class GCD
{
    static int gcd(int x,int y)
    {
        while(x%y!=0)
        {
            int rem=x%y;       //rem=remainder
            x=y;                  // x,y are variable...
            y=rem;
        }
        return y;
    }
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the x integer:");
        int x=sc.nextInt();
        System.out.println("enter the y integer:");
        int y=sc.nextInt();
        System.out.println(gcd(x,y));
    }
}