public class maximumElement
{
    public static int maxInArray(int arr[],int indx)
    {
        if(indx==arr.length-1)
        {
            return arr[indx];
        }
        int smallAns=maxInArray(arr,indx+1);
        return Math.max(arr[indx],smallAns);
    }
    public static void main(String[] args)
    {
      int arr[]={1,3,5,17,8};
        System.out.println(maxInArray(arr,0));
    }
}