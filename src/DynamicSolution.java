
import java.util.ArrayList;

class DynamicSolution {
	private ArrayList<Integer> road;
	private Integer max_j,max_i,route,maxSum;
	
	public DynamicSolution(ArrayList<Integer> road,Integer route) {
		this.road=road;
		this.max_i=0;
		this.max_j=0;
		this.maxSum=0;
		this.route=route;
	}
	
	public void solve() {
		Integer maxSum=0,currSum=0,max_j=0,max_i=0,i_here=0,i=0;
		for(maxSum=currSum=i=0;i<road.size();i++) {
			currSum+=road.get(i);
			if(currSum<0) {
				currSum=0;
				i_here = i+1;
			}
			if(currSum > maxSum || (currSum.equals(maxSum) && (i-i_here) > (max_j - max_i))) {
				maxSum=currSum;
				max_i=i_here;
				max_j=i;
			}
		}
		this.max_j=max_j;
		this.max_i=max_i;
		this.maxSum=maxSum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		if(maxSum.equals(0)) 
			return "Route "+route+" has no nice parts";
		else 
			return "The nicest part of route "+route+" is between stops "+(max_i+1)+" and "+(max_j+2);
		
	}
	
	
}
