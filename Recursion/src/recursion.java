//write a program to print 1 to n all natual number...
import java.util.Scanner;
public  class recursion
{
    static void printIncrease(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        //recursive...
        printIncrease(n-1);
        //self work
        System.out.println(n);//recursive baad me hota h or
    }                    //increasing me phle recusive hota tha.

    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the integer:");
       int n=sc.nextInt();
       printIncrease(n);
    }
}
