package vehiclerentalsystem;
import java.util.*;

public class VehicleRentalSystem {

    public static void main(String[] args) {
        //declarations
        int option;
        String rentId, returnId;
        boolean rented, returned;
        Vehicle[] vehicles = new Vehicle[5];

        // Populate the array
        vehicles[0] = new Car("C1", "VW Golf R", 500, false, 5);
        vehicles[1] = new Car("C2", "Ford Raptor", 650, false, 7);
        vehicles[2] = new Motorcycle("M1", "Yamaha R1", 1200, false, 1000);
        vehicles[3] = new Motorcycle("M2", "Kawasaki Ninja", 900, false, 1100);
        vehicles[4] = new Car("C3", "Honda Civic", 600, false, 5);
         
        //creates a new scanner
        Scanner input = new Scanner(System.in);

        do {
            //prompts for user input
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. View all vehicles");
            System.out.println("2. Rent a vehicle");
            System.out.println("3. Return a vehicle");
            System.out.println("4. Exit!!");
            System.out.print("Enter an option: ");
            option = input.nextInt();
            // clear buffer
            input.nextLine(); 

            //checks for every option
            switch (option){
                case 1:
                    //output
                    System.out.println("--- All the vehicles ---\n");
                    //iterates in the whole array
                    for (Vehicle v : vehicles){
                        //prints all the vehicle
                        System.out.println(v);
                    }
                    break;

                case 2:
                    //prompts for user input
                    System.out.print("Enter vehicle ID to rent: ");
                    rentId = input.nextLine();
                    rented = false;
                     //iterates in the whole array
                    for (Vehicle v : vehicles){
                         //checks if the carID method returns the same value of the rentId
                        if (v.getCarID().equalsIgnoreCase(rentId)){
                            if (!v.isRented()) {
                                //calls method from superclass
                                v.rent();
                                System.out.println("You rented: " + v.getCarBrand());
                                rented = true;
                            } else {
                                System.out.println("Vehicle is already rented.");
                            }
                            break;
                        }
                    }
                    if (!rented){
                        System.out.println("Vehicle not found or unavailable.");
                    }
                    break;

                case 3:
                    System.out.print("Enter vehicle ID to return: ");
                    returnId = input.nextLine();
                    returned = false;

                     //iterates in the whole array
                    for (Vehicle v : vehicles){
                        //checks if the carID method returns the same value of the returnId
                        if (v.getCarID().equalsIgnoreCase(returnId)){
                            //checks  if the vehicle is rented
                            if (v.isRented()){
                                 //calls method from superclass
                                v.returnVehicle();
                                System.out.println("You returned: " + v.getCarBrand());
                                returned = true;
                            } 
                            else{
                                //output returdId is not found
                                System.out.println("Vehicle is not currently rented.");
                            }
                            break;
                        }
                    }
                    if (!returned){
                        System.out.println("Vehicle not found or already returned.");
                    }
                    break;

                case 4:
                    //prints out a goobye message
                    System.out.println("Goodbye ^-^");
                    //terminates program
                    System.exit(0);
                    break;
                    
                default:
                    System.err.println("Invalid option. Try again!");
            }
        } while (option != 4);
         //closes scanner
        input.close();
    }
}
