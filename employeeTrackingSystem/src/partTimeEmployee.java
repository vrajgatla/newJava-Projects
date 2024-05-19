 class partTimeEmployee extends Employee{
  
	 
	 private int hoursworked;
	 private double Hourlyrate;
	 
	 
	 public partTimeEmployee(String name, int id,int hoursworked, double Hourlyrate) {
		 super(name, id);
		 this.hoursworked = hoursworked;
		 this.Hourlyrate = Hourlyrate;
	 }
	 
	 public double calculateSalary() {
		 return hoursworked*Hourlyrate;
	 }
}
