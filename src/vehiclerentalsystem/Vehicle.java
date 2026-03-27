package vehiclerentalsystem;

/**
 *
 * @author ST10480772_Motsuenyane_MDK_Group_5
 */
public class Vehicle {
    //atrributes
     private String carId;
     private String carBrand;
     private double pricePerDay;
     private boolean rented;
     
     //gives value to the attributes
     public Vehicle(String carId,String carBrand,double pricePerDay, boolean rented){
         this.carId= carId;
         this.carBrand = carBrand;
         this.pricePerDay = pricePerDay;
         this.rented = rented;
     }
     //getters 
    public String getCarID(){
      return carId;  
    }
    
     public String getCarBrand(){
        return carBrand;
    }
     
      public double getPricePerDay(){
       return pricePerDay;
    }
      public void returnVehicle() { 
          rented = false;
      }

      
       public boolean isRented(){
        return rented;
    }
       
       //void methods
       public void rent(){
           rented= true;
       }
          public String receipt(){
        return carId + " | " + carBrand + " | R" + pricePerDay + " | " + (rented ? "Rented" : "Available");
    }

        @Override
     public String toString() {
      return receipt();
}

          

}
