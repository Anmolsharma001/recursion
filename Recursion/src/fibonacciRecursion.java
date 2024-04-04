public class fibonacciRecursion
{
    static int fib(int n) //fib=fibonacci function likha h
    {
        //base case
        if(n==0 || n==1)
        {
            return n;
        }
        //subProblem - recursive Work
        int prev=fib(n-1); //prev:- mtlb previous element
        int prevPrev=fib(n-2); //prevPrev:- mtlb previous ka previous;

        //selfWork
        return prev+prevPrev;
    }

    public static void main(String[] args)
    {

        System.out.println(fib(7)); //function ko call kiya h....
    }
}