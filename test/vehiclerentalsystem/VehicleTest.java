package vehiclerentalsystem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ST10480772_Motsuenyane_MDK_Group_5
 */
public class VehicleTest {
    @Test
    public void testRent(){
        Car car = new Car("C3", "VW Polo", 550, false, 5);
        //car is not rented
        assertFalse(car.isRented());
        //rents the car
        car.rent();
        assertTrue(car.isRented());
        
        car.returnVehicle();
        assertFalse(car.isRented());
    }
    
       @Test
    public void testGetters() {
        Vehicle v = new Car("C1", "Test Car", 500, false, 4);

        assertEquals("C1", v.getCarID());
        assertEquals("Test Car", v.getCarBrand());
        assertEquals(500, v.getPricePerDay(), 0.01);
    }
   
}
