


public class car {
    private String carId;
    private String carModel;
    private String carBrand;
    private double basePrice;
    private boolean isAvailable;
    
    
    
    
    public car( String carId,String carModel,String carBrand,double basePrice,boolean isAvailable) {
    	this.carId = carId;
    	this.carModel= carModel;
    	this.carBrand = carBrand;
    	this.basePrice = basePrice;
    	this.isAvailable = isAvailable;
    	
    }
    
    public String getcarId() {
    	return carId;
    }
    public String getcarModel() {
    	return carModel;
    }
    public String getcarBrand() {
    	return carBrand;
    }
    public double totalPrice(int rentaldays) {
    	return basePrice * rentaldays;
    }
    
    public boolean isAvailable() {
    	return isAvailable;
    }
    
    public void rent() {
         isAvailable = false;
    }
    public void isrturn () {
    	 isAvailable = true;
    }
    
    public String toString() {
		return " car[name = "+carId+",model = "+carModel+", brand = "+carBrand+",price = "+basePrice+"";
	}
 
    

}
