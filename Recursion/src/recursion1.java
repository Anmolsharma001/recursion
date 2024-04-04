//write a program n to 1 in all natural number
import java.util.Scanner;
public class recursion1
{
    static void printDecrease(int n)
    {
        //base case
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        //self work
        System.out.println(n);//self work phle hota h ismee
        //recursive...
        printDecrease(n-1); //recursive baad me hota h or
    }                          //increasing me phle recusive hota tha.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter an integers");
        int n=sc.nextInt();
        printDecrease(n);

    }
}
