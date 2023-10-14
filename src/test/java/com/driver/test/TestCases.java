package com.driver.test;

import com.driver.Boat;
import com.driver.F1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    @Test
    public void testF1Acceleration() {
        System.out.println(3);
    }

    @Test
    public void testBoat() {
        Boat boat = new Boat("SpeedBoat", 6);

        // Test boat name and capacity
        assertEquals("SpeedBoat", boat.getVehicleName());
        assertEquals(6, boat.getVehicleCapacity());
    }
}
