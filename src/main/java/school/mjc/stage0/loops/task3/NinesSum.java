package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
    	int sum = 0;
    	int result =0;
    	int s=1;   // 9 + (9 ++ 99) ++ (9 ++ 99)+999 ++   ((9 ++ 99)+999) +9999
    	for (int i=0; i<lengthOfLastNumber;i++) {
    		
    			sum = sum + (int)(9*Math.pow(10, i));
    			result = result + sum;
    		    		}
    		
    		
    	System.out.println(result);

    
}}
