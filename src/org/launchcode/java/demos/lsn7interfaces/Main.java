package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Before");
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        System.out.println("");

        System.out.println("After");
        Collections.sort(flavors, new FlavorComparator());
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
