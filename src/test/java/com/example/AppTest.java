package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testInheritance() {
        Car myCar = new Car();
        assertEquals("Ford", myCar.getBrand()); // Tests inherited field
        assertEquals("Mustang", myCar.getModel());
    }
}
