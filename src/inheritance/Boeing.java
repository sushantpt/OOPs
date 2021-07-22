package inheritance;

public class Boeing extends Airplane {
	
	public String airlinesName;
	public String headingTowards;
	public int totalPassengers;
	public int totalCrews;
	
	public Boeing(String name, String location, int passengers, int crews, int planeSpeed, int planeGear) { //constructor
		super(planeSpeed, planeGear);
		this.airlinesName = name;
		this.headingTowards = location;
		this.totalPassengers = passengers;
		this.totalCrews = crews;
	}
	
	public void headingTowards(String newValue) {
		this.headingTowards = newValue;
	}
	
	public void totalPassengers(int newValue) {
		this.totalPassengers = newValue;
	}
	
	public void totalCrews (int newValue) {
		this.totalCrews = newValue;
	}


}
