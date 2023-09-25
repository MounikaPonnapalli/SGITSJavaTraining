class ForEach
{
    public static void main(String[] args) 
    {
        int[] arr={1, 1, 2, 2, 4, 3, 6, 5, 5, 7, 6, 8, 2, 1, 8, 5};
        int n=arr.length;
        sort(arr,n);
        boolean isFirst=true;
        for(int num:arr) 
        {
            if(num!=arr[0])
            {
                if(!isFirst)
                {
                    System.out.print(" ");
                }
                if(num%2==0)
                {
                    System.out.print(num);
                    isFirst=false;
                }
                arr[0]= num;
            }
        }
    }
    static void sort(int[] arr,int n){
    int temp;
    for(int i=0;i<n-1;i++) 
    {
        for(int j=0;j<n-i-1;j++) 
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}}

