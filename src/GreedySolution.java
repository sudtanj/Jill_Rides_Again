import java.util.ArrayList;

class GreedySolution {
	private ArrayList<Integer> road;
	private Integer route,maxSum,minValue,maxValue;
	
	public GreedySolution(ArrayList<Integer> road,Integer route) {
		this.road=road;
		this.route=route;
		this.maxSum=0;
		this.minValue=0;
		this.maxValue=0;
	}
	
	public void solve() {
		Integer currSum=0,minValue=0,i,j,maxSum;
		for(maxSum=i=0;i<this.road.size();i++) {
			currSum+=this.road.get(i);
			if(currSum<0) {
				minValue=i+1;
				currSum=0;
			}
		}
		this.minValue=minValue+1;
		this.maxValue=this.road.size();
		if(this.minValue.equals(this.maxValue)) {
			this.maxValue++;
		}
		this.maxSum=currSum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		if(maxSum.equals(0)) 
			return "Route "+route+" has no nice parts";
		else 
			return "The nicest part of route "+route+" is between stops "+this.minValue+" and "+this.maxValue;
	}
	
	
}
