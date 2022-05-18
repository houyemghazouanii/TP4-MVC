package beans;

public class RandomBean {
	private double numbr;
	
	public RandomBean(){
		setNumbr(0);
	}

	public double getNumbr() {
		return numbr;
	}

	public void setNumbr(double numbr) {
		this.numbr = numbr;
	}
	public double CalculRandom(double numbr){
		return Math.random()*numbr;
	}
}
