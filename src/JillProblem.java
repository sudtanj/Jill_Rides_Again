import java.util.ArrayList;
import java.util.Scanner;

class JillProblem {
	private ArrayList<Integer> road=new ArrayList<Integer>();
	private Integer j,i,nOfRoute,nOfStop,currSum,maxSum,minValue,maxValue,routeCounter=1;;
	private Scanner scanner=new Scanner(System.in);
	private Integer i_here=0,max_i=0,max_j=0;
	
	public void greedySolution() {
		Integer prevMaxSum=0;
		for(maxSum=i=0;i<nOfStop;i++) {
			for(currSum=0,j=i;j<nOfStop;j++) {
				currSum +=road.get(j);
				if(currSum>maxSum) {
					maxSum=currSum;
					minValue=i+1;
				}
			}
		}
	}
	public void printGreedySolution() {
		if(maxSum.equals(0)) 
			System.out.println("Route "+routeCounter+" has no nice parts");
		else {
			System.out.println("The nicest part of route "+routeCounter+" has niceness "+maxSum);
			System.out.println("It is between "+minValue+" and "+maxValue);
		}
	}

	public void beginInput() {
		//Brute Force Algorithm
		nOfRoute=scanner.nextInt();
		while(routeCounter<=nOfRoute) {
			nOfStop=scanner.nextInt();
			road.clear();
			for(int i=0;i<(nOfStop-1);i++) 
				road.add(scanner.nextInt());
			//road.add(0);
			DynamicSolution solus=new DynamicSolution(road,this.routeCounter);
			solus.solve();
			System.out.println(solus);
			routeCounter++;
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		JillProblem jill = new JillProblem();
		jill.beginInput();
	}
}
