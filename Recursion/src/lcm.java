//ecluide se solve kiya h lam and gcd dono h ismeeee...
 import java.util.Scanner;
class gcd
{
    static int gcd(int x,int y)
    {
        if(y==0)
        {
            return x;
        }
        return gcd(y,x%y);
    }
    static int lcm(int x,int y,int gcdValue)
    {
        return Math.abs(x*y)/gcdValue;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st integer");
        int x=sc.nextInt();
        System.out.print("enter the 2nd integer");
        int y=sc.nextInt(),gcdValue;
        gcdValue=gcd(x,y);
        System.out.println("gcd"+gcdValue);
        System.out.println("lcm"+lcm(x,y,gcdValue));

    }
}