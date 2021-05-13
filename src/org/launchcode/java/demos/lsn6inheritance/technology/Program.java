package org.launchcode.java.demos.lsn6inheritance.technology;

public class Program {
    public static void main(String[] args) {

        Computer desktop = new Computer (16, 1);
        Laptop hp = new Laptop(8, 0.5, true, 50);
        SmartPhone galaxyS9 = new SmartPhone(2, 0.2, true, 80, true);

        System.out.println(hp.needsCharging());
        System.out.println(desktop.connectedToInternet());
        System.out.println(galaxyS9.dial());
    }
}
