package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technology.SmartPhone;

import static org.junit.Assert.*;

public class smartPhoneTest {

    SmartPhone testPhone;
    @Before
    public void createLaptopObject(){
        testPhone = new SmartPhone(8,.5, true, 50, true);
    }

    @Test
    public void emptyTest(){
        assertEquals(1,1,.001);
    }

    @Test
    public void dialReturnsValue(){
        assertEquals("fine, no soup for you!", testPhone.dial());
    }

}