package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
    	int max = Math.max(first, second);
    	int GCD=0;
    	for (int i=1 ; i<=max; i++) {
    		 if (first %i==0 && second%i ==0) {
    		   GCD= i;
    		 }
    	
    	}	
    	System.out.println(GCD);
    		 }
    			
    	
    	
    
}
