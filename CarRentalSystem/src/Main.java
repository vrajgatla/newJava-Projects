
	public class Main{
		public static void main(String[] args){
			rentalSystem  rentcar = new rentalSystem();
			
			
			
			car car1 = new car( "c001", "toyato", "camry",99.0,true);
			car car2 = new car( "c002", "maruthi", "camrswift",119.0,true);
			car car3 = new car( "c003", "ford", "thor",89.0,true);
			car car4 = new car( "c004", "eagle", "dzire",95.0,true);
			
			
			
			rentcar.addcar(car1);
			rentcar.addcar(car2);
			rentcar.addcar(car3);
			rentcar.addcar(car4);
			
			rentalSystem.menu();
		}
	}
		


