package vehiclerentalsystem;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testSeats() {
        Car car = new Car("C1", "VW Golf", 600, false, 5);
        assertEquals(5, car.getSeats());
    }

    @Test
    public void testReceiptIncludesSeats() {
        Car car = new Car("C2", "Ford", 700, false, 7);
        String receipt = car.receipt();
        assertNotNull(receipt);
        assertTrue(receipt.contains("Seats: 7"));
    }

    @Test
    public void testCarIsInitiallyNotRented() {
        Car car = new Car("C3", "Honda", 500, false, 4);
        assertFalse(car.isRented());
    }
}







