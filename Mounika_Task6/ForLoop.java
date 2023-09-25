package Mounika_Task6;
public class ForLoop {
    public static void main(String[] args)
    {
        int[] arr={1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
        int n=arr.length;
        sort(arr,n);
        boolean isFirst=true;
        for(int i=0;i<n;i++)
        {
            if(i==0||arr[i]!=arr[i-1]) 
            {
                if(!isFirst)
                {
                    System.out.print(" ");
                }
                if(arr[i]%2==0)
                {
                    System.out.print(arr[i]);
                    isFirst=false;
                }
            }
        }
    }
    static void sort(int arr[], int n) 
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
