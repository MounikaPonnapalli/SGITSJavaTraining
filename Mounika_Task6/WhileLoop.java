public class WhileLoop {
    public static void main(String[] args)
    {
        int[] arr={1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
        int n=arr.length;
        sort(arr,n);
        boolean isFirst=true;
        int i=0;
        while(i<n) 
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
            i++;
        }
    }
    static void sort(int[] arr,int n) 
    {
        int temp=0;
        int i=0;
        while(i<n) 
        {
            int j=1;
            while(j<(n-i)) 
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
            i++;
        }
    }
    
}
