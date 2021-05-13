package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technology.Laptop;

import static org.junit.Assert.*;

public class laptopTest {

    Laptop testLaptop;
    @Before
    public void createLaptopObject(){
        testLaptop = new Laptop(8,.5, true, 50);
    }

    @Test
    public void emptyTest(){
        assertEquals(1,1,.001);
    }

    @Test
    public void needsChargingWorks(){
        assertTrue(testLaptop.needsCharging() == false);
    }

}
