package org.launchcode.java.demos.lsn6inheritance.technology;

import java.util.Scanner;

public class Computer {
    private double ram;
    private double storage;
    private boolean internet = false;
    private Scanner connection = new Scanner(System.in);
    private Scanner onOffSwitch = new Scanner(System.in);

    public Computer (double aRam, double aStorage) {
        ram = aRam;
        storage = aStorage;
    }

    public double getRam() {
        return ram;
    }
    public void setRam(double ram) {
        this.ram = ram;
    }
    public double getStorage() {
        return storage;
    }
    public Scanner getConnection() {
        return connection;
    }
    public Scanner getOnOffSwitch() {
        return onOffSwitch;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }
    public boolean isInternet() {
        return internet;
    }
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    public void setConnection(Scanner connection) {
        this.connection = connection;
    }
    public void setOnOffSwitch(Scanner onOffSwitch) {
        this.onOffSwitch = onOffSwitch;
    }

    public String typeMessage(){
        return "message";
    }

    public boolean connectedToInternet(){
        if(connection.toString() == "yes"){
            return internet = true;
        }
        return internet;
    }

    public String power(){
        if(onOffSwitch.toString() == "on"){
            return "Powering on";
        }
        return "Off";
    }

}
