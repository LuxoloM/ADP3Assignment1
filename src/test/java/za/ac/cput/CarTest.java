package za.ac.cput;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

import static org.junit.Assert.*;

public class CarTest {

    Car c1 = new Car("Sabaru", 2010);
    Car c2 = new Car("Chevrolet", 2008);


    @org.junit.Test
    public void geCarName() {
        assertEquals("Sabaru", c1.geCarName());
    }

    @Disabled
    @org.junit.Test
    public void getCarModel() {
        assertEquals("Toyota", c2.geCarName());
    }

    @Timeout(2)
    @Test
    public void testTimeOut(){
        Car c1 = new Car("Toyota", 2020);
        String newVehicle = c1.geCarName();
        int model = c1.getCarModel();
        System.out.println(newVehicle + " "+ model);
    }


}