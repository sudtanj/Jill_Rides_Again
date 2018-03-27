package jillrideagain;

import java.util.ArrayList;
import java.util.Scanner;

public class JillProblem {
	private ArrayList<Integer> road=new ArrayList<Integer>();
	private Integer j,i,nOfRoute,nOfStop,currSum,maxSum,minValue,maxValue;
	
	public void greedySolution() {
		Scanner scanner=new Scanner(System.in);
		nOfRoute=scanner.nextInt();
		Integer routeCounter=1;
		while(routeCounter<=nOfRoute) {
			nOfStop=scanner.nextInt();
			road.clear();
			for(int i=0;i<(nOfStop-1);i++) 
				road.add(scanner.nextInt());
			road.add(0);
			for(maxSum=i=0;i<nOfStop;i++) {
				for(currSum=0,j=i;j<nOfStop;j++) {
					currSum +=road.get(j);
					maxValue=i+1;
					if(currSum>maxSum) {
						maxSum=currSum;
						minValue=i+1;
					}
				}
			}
			if(maxSum.equals(0)) 
				System.out.println("Route "+routeCounter+" has no nice parts");
			else {
				System.out.println("The nicest part of route "+routeCounter+" has niceness "+maxSum);
				System.out.println("It is between "+minValue+" and "+maxValue);
			}
			routeCounter++;
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		JillProblem jill = new JillProblem();
		jill.greedySolution();
	}
}
