package unitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HospitalTest {
	Hospital hospital;

	@BeforeEach
	void setUp() throws Exception {
		hospital = new Hospital();
	}

	@Test
	void testOverTime() {
		hospital.overTime(120);  	 // doc worked overTime
		hospital.overTime(765);		// doc worked overTime
		hospital.leave(122.55);		// doc had a leave.
		hospital.overTime(650.75);	// doc worked overTime
		assertEquals(hospital.salary, 1413.2, 1400.65);
	}

	@Test
	void testLeave() {
		hospital.overTime(82.12);	// doc worked overTime
		hospital.leave(50.75);		// doc had a leave.
		hospital.leave(10.15); 	// doc had a leave.
		hospital.leave(76.75);
		hospital.leave(42);
		hospital.leave(15.87);
		assertEquals(hospital.salary, -113.4, 1400.65);
		
	}

}
