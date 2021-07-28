package encapsulation;

public class Restaurant {
	private double totalIncome;
	private String owner;
	private int totalWorkers;
	
	public Restaurant(String owner, int totalIncome, int totalWorkers) {
		this.owner = owner;
		this.totalIncome = totalIncome;
		this.totalWorkers = totalWorkers;
	}
	
	public void setName(String newOwner) {
		this.owner = newOwner;
	}
	
	public void setIncome(double newIncome) {
		this.totalIncome = newIncome;
	}
	
	public void setWorkers(int newWorkers) {
		this.totalWorkers = newWorkers;
	}
	
	public String getName() {
		owner = owner.toUpperCase();
		return owner;
	}
	
	public double getIncome() {
		return totalIncome;
	}
	
	public int getWorkers() {
		return totalWorkers;
	}
}
