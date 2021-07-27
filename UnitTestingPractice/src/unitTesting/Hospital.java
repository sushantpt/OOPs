/** 
 *  Scenario --> Hospital class. Hospital properties --> doctor (docName) and doctor's salary (salary).
 *  			whenever doc works overtime, salary increases.
 *  			whenever doc is in leave, salary decreases.
 */

package unitTesting;

public class Hospital {
	String docName;
	double salary = 1400.65;
	
	public void overTime(double amount) {
		salary += amount;
	}
	
	public void leave(double amount) {
		salary -= amount;
	}
}
