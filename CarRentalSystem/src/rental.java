
public class rental {
	
	private car car;
	private customer customer;
	private int days;
	
	
	
	public rental ( car car, customer customer, int days) {
		this.car = car;
		this.customer = customer;
		this.days = days;
	}
	 public car getcar() {
		 return car;
		 
	 }
	 public customer getcustomer() {
		 return customer;
	 }
	 public int getdays() {
		 return days;
	 }

}
