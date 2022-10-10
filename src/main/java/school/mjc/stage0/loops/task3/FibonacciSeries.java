package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
    	int previousNumber=0;
    	int nextNumber=1;
    	for (int i = 1; i <= lastFibonacci;i++) {
    		 {
 	           // System.out.print(previousNumber+" ");
 	            /* On each iteration, we are assigning second number
 	             * to the first number and assigning the sum of last two
 	             * numbers to the second number
 	             */
  
    			 System.out.println(previousNumber);
 	            int sum = previousNumber + nextNumber;
 	            previousNumber = nextNumber;
 	            nextNumber = sum;
 	            
 	        }
    	    
    			
    		} 
    	
    
    }
    
}
