package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
    	String test = "" ;
    	String neww= test + Math.abs(t);
    	int counter= 0;
    	 int  ss = neww.charAt(counter);
    	//for (i=0   
    	 for (int i=0 ; i< neww.length(); i++) {
    		
    		counter= counter +neww.charAt(i) - '0';
    		
    	 
    	 }
    	 System.out.println(counter);
    	

    }
}
