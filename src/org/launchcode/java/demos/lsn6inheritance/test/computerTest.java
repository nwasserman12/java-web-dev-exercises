package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.java.demos.lsn6inheritance.technology.Computer;

import static org.junit.Assert.*;

public class computerTest {
    Computer testComputer;
    @Before
    public void createComputerObject(){
        testComputer = new Computer(16, 1);
    }
    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }

    @Test
    public void setsRamInConstructor(){
        assertEquals(16, testComputer.getRam(), .001);
    }
    @Test
    public void setsStorageInConstructor(){
        assertEquals(1, testComputer.getStorage(), .001);
    }

    @Test
    public void returnsValueForConnectedToInternet(){
        assertTrue(testComputer.connectedToInternet() == false);
    }
}
