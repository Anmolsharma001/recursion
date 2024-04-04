// time & space complexity iski acchci h to ye better h code phle wale se
public class Power2
{
    static int pow(int p,int q) //power function banaya h
    {
        if(q==0) // agar q=0 h to value 1
            return 1;
        int smallPow=pow(p,q-1); //smallPow is varaible
        if(q%2==0)                 //EVEN CONDITION.... h to
        {
            return smallPow*smallPow;
        }
        else
        {                          //ODD CONDITION... h to
            return p*smallPow*smallPow;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(pow(2,3));
    }
}