public class Power
{
    static int pow(int p,int q)
    {
        //base case
        if(q==0)
            return 1;
        //recursive case
        int smallAns=pow(p,q-1); //p^q-1 aur "*" kare p ka to p =p^q
        //selfWork
        return smallAns*p;
    }
    public static void main(String[] args)
    {
        System.out.println(pow(2,3));
    }
}