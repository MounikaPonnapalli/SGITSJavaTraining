package pujitha6;

public class WhileFabonacciSeries {

	public static void main(String[] args) {
		int n1=0,n2=1;
		  System.out.println("enter the fabinacci series:");
		  while(n1<=50)
		  {
			  System.out.print(n1+" ");
			  n1=n1+n2;
			  n2=n1-n2;
			  
			  
		  }


	}

}
