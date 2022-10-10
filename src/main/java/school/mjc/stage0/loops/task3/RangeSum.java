package school.mjc.stage0.loops.task3;

import java.util.Iterator;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
    	int counter=0;
    	for (int i =firstBoarder; i <= secondBoarder; i++ ) {
    	 	   counter = counter + i ;
        }
    	 System.out.println(counter);
    	
    	}
}
