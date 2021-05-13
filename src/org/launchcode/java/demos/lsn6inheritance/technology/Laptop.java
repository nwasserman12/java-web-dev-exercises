package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer{
    private boolean portable = true;
    private double batteryLife;

    public Laptop(double aRam, double aStorage, boolean aPortable, double aBatteryLife){
        super(aRam, aStorage);
        portable = aPortable;
        batteryLife = aBatteryLife;
    }

    public boolean needsCharging(){
        if(batteryLife < 30){
            return true;
        }
        return false;
    }
}
