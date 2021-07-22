package inheritance;

public class CallAllClasses {
	public static void main (String [] args) {
		Boeing boeing = new Boeing("Flight F-123", "London", 131, 7, 419, 7);
		System.out.println("----------Information of " + boeing.airlinesName + "----------");
		System.out.println(boeing.airlinesName + " is heading towards " + boeing.headingTowards + " with the speed " + boeing.speed + "mph." );
		System.out.println(boeing.airlinesName + " is carrying total of " + boeing.totalPassengers + " passengers and " + 
							boeing.totalCrews + " crews members. Making them total of " + 
							(boeing.totalCrews + boeing.totalPassengers) + ".");
		boeing.decreaseSpeed(47);
		System.out.println("Currently, the speed of " + boeing.airlinesName + " is " + boeing.speed + "mph.");
	

	}

}
