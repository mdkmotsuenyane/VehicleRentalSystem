
package vehiclerentalsystem;

/**
 *
 * @author ST10480772_Motsuenyane_MDK_Group_5
 */

//Subclass 1
 class Car extends Vehicle {
    private int seats;
    
    //constructor
    public Car(String carId, String carBrand, double pricePerDay, boolean rented, int seats) {
        //calls the superclass
        super(carId, carBrand, pricePerDay, rented);
        this.seats = seats;
    }
    
    public int getSeats(){
        return seats;
    }
    @Override
    public String toString(){
        return super.toString()+" | Seats: "+seats;
    }
}


