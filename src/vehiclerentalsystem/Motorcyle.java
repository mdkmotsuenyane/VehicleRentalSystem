package vehiclerentalsystem;

/**
 *
 * @author RC_Student_lab
 */
//Subclass 2
class Motorcycle extends Vehicle{
   //attribute
    private int engineCapacity;

    public Motorcycle(String carId, String carBrand, double pricePerDay, boolean rented, int engineCapacity) {
        //calls the superclass
        super(carId, carBrand, pricePerDay, rented);
     this.engineCapacity = engineCapacity;   
    }
    
    //getter method
   public int getEngineCapacity(){
       return engineCapacity;
   }
    
   @Override
    public String toString(){
        return super.toString()+" | Engine: "+engineCapacity+"cc";
    }
}
