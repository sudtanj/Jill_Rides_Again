import java.util.ArrayList;
import java.util.Scanner;

class JillProblem {
	private ArrayList<Integer> road=new ArrayList<Integer>();
	private Integer nOfRoute,nOfStop,routeCounter=1;;
	private Scanner scanner=new Scanner(System.in);

	public void beginInput() {
		nOfRoute=scanner.nextInt();
		while(routeCounter<=nOfRoute) {
			nOfStop=scanner.nextInt()-1;
			road.clear();
			for(int i=0;i<nOfStop;i++) 
				road.add(scanner.nextInt());
			//DynamicSolution solus=new DynamicSolution(this.road,this.routeCounter);
			GreedySolution solus=new GreedySolution(this.road,this.routeCounter);
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
