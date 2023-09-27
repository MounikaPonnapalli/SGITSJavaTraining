package pujitha6;

public class DoWhileFabonacciSeries {

	public static void main(String[] args) {
		int a = 0; 
        int b = 1;
     do{
    	  
            a += b;
            b = a - b;
            System.out.print(" "+ b);
          
       }

            while(a<=50);	

	}

}
