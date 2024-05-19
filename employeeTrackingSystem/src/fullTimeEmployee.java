

class fullTimeEmployee extends Employee{
	
	private  double monthlysalary;
	
 public fullTimeEmployee(String name,int id,double monthlysalary) {
	 super(name, id);
	 this.monthlysalary= monthlysalary;
 }
 
 public double calculateSalary() {
	 return monthlysalary;
 }

	
}
