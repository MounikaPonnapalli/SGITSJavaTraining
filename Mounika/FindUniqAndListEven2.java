class FindUniqAndListEven2
{
    public static void main(String[] args)
    {
        int[] arr = {1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
        System.out.print("Unique Elements:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j&&arr[j]==arr[i])
                {
                    break;
                }
                if(j==arr.length- 1) 
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println(" ");
        System.out.print("Even Elements:");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) 
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}