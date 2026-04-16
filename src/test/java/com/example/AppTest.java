package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testInheritance() {
        Vehicle myCar = new Car();
        // Verifies that the Car object correctly inherited and overrode the method
        assertEquals("Petrol", myCar.fuelType());
    }
}
