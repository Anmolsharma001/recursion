//sum of digit ka code h means 1234 h to sub ko add kar lo (1+2+3+4)=10
 public class SOD
{
    static int sumOfDigit(int n)
    {
        //base case
        if(n>=0 && n<=9)
        {
            return n;
        }
        //recursive work ->in small work
        int smallAns=sumOfDigit(n/10);
        //self work...
        return smallAns+n%10;
    }
    public static void main(String[] args)
    {
        System.out.println(sumOfDigit(12345));
    }
}
