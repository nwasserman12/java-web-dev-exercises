package org.launchcode.java.demos.lsn6inheritance.technology;

import java.util.Scanner;

public class SmartPhone extends Laptop{
    private boolean touchScreen = true;
    private Scanner callSomeone = new Scanner (System.in);


    public SmartPhone(double aRam, double aStorage, boolean aPortable, double aBatteryLife, boolean aTouchScreen){
        super(aRam, aStorage, aPortable, aBatteryLife);
        touchScreen = aTouchScreen;
    }

    public String dial(){
        if (callSomeone.toString() == "yes"){
            return "Dialing";
        }
        return "fine, no soup for you!";
    }
}
