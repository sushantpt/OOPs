package encapsulation;

public class Main {
	public static void main (String [] args) {
		Restaurant res = new Restaurant(null, 0, 0);
		res.setName("Johnny Walker");
		res.setIncome(140.87);
		res.setWorkers(14);
		
		String words = "Owner of this restaurant is Mr.";
		String income = "Today, " + res.getName() + " made about $";
		String workers = "This restaurant has ";
		
		
		System.out.println(words + res.getName());
		System.out.println(income + res.getIncome());
		System.out.println(workers + res.getWorkers() + " workers.");
		
	}

}
