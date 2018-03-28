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
		for(maxSum=i=0;i<this.road.size();i++) 
			for(currSum=0,j=i;j<this.road.size();j++) {
				currSum +=road.get(j);
				if(currSum>maxSum) {
					maxSum=currSum;
					minValue=i+1;
				}
			}
		this.minValue=minValue;
		this.maxSum=maxSum;
		if(minValue.equals(this.road.size())) 
			maxValue=minValue+1;
		
		else 
			maxValue=this.road.size();
	
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
