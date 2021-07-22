package inheritance;

public class Airplane {
	protected int speed; //properties/attribute of plane
	protected int gear;  //properties/attribute of plane
	
	public Airplane(int planeSpeed, int planeGear) { //constructor to initialize plane's speed and plane's gear.  
		speed = planeSpeed;
		gear = planeGear;
	}

	public void setGear(int newValue) { // method to set gear's values.
		gear = newValue;
	}
	
	public void increaseSpeed(int increment) { // increase speed according to (int increment's value)
		this.speed += increment;
	}
	
	public void decreaseSpeed(int decrement) {
		this.speed -= decrement; //decrease speed according to (int decrement's value)
	}
	
}
