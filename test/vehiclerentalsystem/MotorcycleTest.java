package vehiclerentalsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class MotorcycleTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEngineCapacity() {
        Motorcycle moto = new Motorcycle("M1", "Yamaha R1", 1200, false, 1000);
        assertEquals(1000, moto.getEngineCapacity());
    }

    @Test
    public void testReceiptIncludesEngineCapacity() {
        Motorcycle moto = new Motorcycle("M2", "Kawasaki Ninja", 1100, false, 1100);
        String receipt = moto.receipt();
        assertNotNull(receipt);
        assertTrue(receipt.contains("Engine: 1100cc"));
    }

    @Test
    public void testRentMotorcycle() {
        Motorcycle moto = new Motorcycle("M3", "Suzuki", 950, false, 800);
        assertFalse(moto.isRented());

        moto.rent();
        assertTrue(moto.isRented());

        moto.returnVehicle();
        assertFalse(moto.isRented());
    }

    /**
     * Test of getEngineCapacity method, of class Motorcycle.
     */
    @Test
    public void testGetEngineCapacity() {
        System.out.println("getEngineCapacity");
        Motorcycle instance = null;
        int expResult = 0;
        int result = instance.getEngineCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Motorcycle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Motorcycle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
