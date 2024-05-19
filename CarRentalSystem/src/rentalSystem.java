import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class rentalSystem {
	
	private static List<car> cars;
	private static List<customer> customers;
	private static List<rental> rentals;

public rentalSystem () {
	cars = new ArrayList<>();
	customers = new ArrayList<>();
	rentals = new ArrayList<>();	
}


public void addcar(car car) {
	cars.add(car);
	
}
public static void addcustomer(customer customer) {
	customers.add(customer);
}



public static void rentcar(car car, customer customer, int days) {
	if ( car.isAvailable()) {
		car.rent();
		rentals.add( new rental (car, customer, days));
	}
	else {
		System.out.println( " car is not available fo rent");
		}
	}
	
	
	
	public static void returnCar(car car) {
	   // car.returnCar(); // Assuming this method exists in the Car class
	    
	    rental rentalToRemove = null;
	    for (rental rental : rentals) {
	        if (rental.getcar() == car) {
	            rentalToRemove = rental;
	            break;
	        }
	    }
	    
	    if (rentalToRemove != null) {
	        rentals.remove(rentalToRemove);
	        System.out.println("Car returned successfully.");
	    } else {
	        System.out.println("Car was not rented.");
	    }
	}
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println(" ===== car rental system ====");
			System.out.println( " 1. rent a car ");
			System.out.println( " 2 return a car");
			System.out.println(" 3. exit");
			System.out.println(" enter your choise==");
			
			
			int choice = scanner.nextInt();
			 scanner.nextLine();
			 
			 if ( choice ==1 ) {
				 System.out.println ( "\n == rent a car ==\n");
				 System.out.print(" enter your name");
				 String customername = scanner.nextLine();
			
				for ( car car:cars) {
					System.out.println( car.toString());
				}
					
				 
				 
				 System.out.print( "\n enter the carId you want to rent");
				 String carId = scanner.nextLine();
				 
				 
				 System.out.print("Enter your number of days foe rental");
				 int rentaldays = scanner.nextInt();
				 scanner.nextLine();
				 
				 
				 customer newCustomer= new customer ( "cus "+ (customers.size() + 1), customername );
				 addcustomer(newCustomer);
				 
				 
				 car selectedcar = null;
				  for ( car car : cars)
				  if ( car.getcarId().equals(carId) && car.isAvailable()) {
					  selectedcar = car; 
					  break;
				  }
			 
			 if  (selectedcar != null) {
				 double totalprice = selectedcar.totalPrice(rentaldays);
				 System.out.println("\n== rental information ==\n");
				 System.out.println(" cusomer Id " + newCustomer.getcustomerId());
				 System.out.println(" custoemr name "+ newCustomer.getname());
				 System.out.println(" car"+ selectedcar.getcarBrand() + "" + selectedcar.getcarModel());
				 System.out.println(" rental days " + rentaldays);
				 System.out.printf(" total price = $%.2f\n", totalprice);
				 
				 System.out.println("\n conform rental (Y/N):");
				 String confirm = scanner.nextLine();
				 
				  if ( confirm.equalsIgnoreCase("Y")) {
					  rentcar(selectedcar, newCustomer, rentaldays);
					  System.out.println( "\n car rented succesfully");
				  
			 }else {
				 System.out.println("\n rental cancelled");
			 }
				  
			 }  else {
					 System.out.println("\n invalid car selesction");
				 }
			 
		}else if(choice ==2) {
			System.out.println("\n == return a car \n");
			System.out.print(" enter the car id you want to return");
			String carId = scanner.nextLine();
			
			
			car carToReturn = null;
			for ( car car : cars) {
				if ( car.getcarId().equals(carId) && !car.isAvailable()) {
					carToReturn = car;
					 
					break;
				}
			}
			
			
			if ( carToReturn != null) {
				customer customer = null;
				for (rental rental : rentals) {
					if (rental.getcar() == carToReturn) {
						customer = rental.getcustomer();
						break;
					}
				}
				
				if ( customer != null) {
					returnCar (carToReturn);
					System.out.println( " car returned successfully by "+ customer.getname());
				}else {
					System.out.println ( " car ws not rented otr rental informatmation is missing");
				}
				
			}else if ( choice == 3) {
				 break;
			}else {
				System.out.println( "invlid choice.pleas enter a valid option");
				
			}
		}
		
		System.out.println("\n thank you for using the car rental system");
		
		}
		
		
	}
		
		
	
	
	
	

		 
	 
	 
		
	
	
	
	
	
	
	
}

