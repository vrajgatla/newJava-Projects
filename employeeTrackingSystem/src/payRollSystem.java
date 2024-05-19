import java.util.ArrayList;

class payRollSystem {
	
	private static ArrayList<Employee> employeeList;
	
	
	public payRollSystem() {
		employeeList = new ArrayList<>();
	}
	public static void addEmployee( Employee employee) {
		employeeList.add( employee);
	}
	
	
	
	public void removeEmployee   (int id) {
		 Employee employeeToRemove = null;
		 for( Employee employee : employeeList) {
			 if ( employee.getId() ==id) {
				  employeeToRemove = employee;
				  break;
			 }
		 }
		 
		 if(employeeToRemove != null) {
			 employeeList.remove(employeeToRemove);
		 }
		 
	}
		 public void   displayEmployee(){
			 for (Employee employee: employeeList){
				 System.out.println(employee);
			 }
		 }
	}


