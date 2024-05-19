
public class MainPayrollSystesm {

	public static void main( String[] args) {
		payRollSystem payrollSystem = new payRollSystem();
		fullTimeEmployee emp1 = new fullTimeEmployee("vikas",1, 30000);
		partTimeEmployee emp2 = new partTimeEmployee("raj", 2,50,100);
		
		
	    payRollSystem.addEmployee(emp1);
	    payRollSystem.addEmployee(emp2);
	    System.out.println("intital Emplooyee deatils");
	    payrollSystem.displayEmployee();
	    System.out.println("removing employee");
	    payrollSystem.removeEmployee(2);
	    System.out.println("removing Emplooyee deatils");
	    payrollSystem.displayEmployee();


	}
	
	
	
	
	
}
