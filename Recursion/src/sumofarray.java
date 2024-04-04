public class sumofarray
{
    public static int SumOfArray(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            return 0;
        }
        int smallAns=SumOfArray(arr,idx+1);
        return smallAns+arr[idx];
    }
    public static void main(String[] args) {
     int arr[]={2,3,4,5};
        System.out.println(SumOfArray(arr,0));
    }
}