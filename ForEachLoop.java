package javapractice;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,-1,-3,-4};
        int psum=0,nsum=0;
		
		for (int n1:arr) 
		{
		    if (n1 > 0)
		    {
		        psum += n1;
		    } else if (n1 < 0) 
		    {
		        nsum += n1;
		    }
		}

	        
	        System.out.println("Sum of positive elements: " + psum);
	        System.out.println("Sum of negative elements: " + nsum);


	}

}
