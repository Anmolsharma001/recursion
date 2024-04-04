public class stricklyIncrease
{
    public static boolean isSorted(int arr[],int indx)
    {
        if(indx==arr.length-1)
        {
            return true;
        }
        if(arr[indx]<arr[indx+1])
        {
            return isSorted(arr,indx+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
      int arr[]={1,2,3,4,7,8,9};
        System.out.println(isSorted(arr,0));
    }//index ki value agar zero h to index zero se start honga
}