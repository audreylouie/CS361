/**
 * 
 */
package employee;

/**
 * @author Audrey Louie
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints "PART TIME EMPLOYEE" because emp3 is referencing to pEmp1 who is a part time employee.
		// emp3.getHourlyRate(); // returns syntax error because getHourlyRate() method is not defined in the Employee class.

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		// if (CONDITION) {
		// System.out.println("emp3 instance of part time employee"); // printed
		// } else {
		//System.out.println("emp3 not instance of part time employee");
		// }

		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); 
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		// PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles / does not compile (does not compile)
		// This instruction returns a ClassCastException at run time
		// because ... 
		// We are attempting to cast pEmp3 as a PartTimeEmployee when emp1 is a full time employee.
		// This does not work because emp1 is not an instance of PartTimeEmployee.

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
