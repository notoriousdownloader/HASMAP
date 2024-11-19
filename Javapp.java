/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapp;

/**
 *
 * @author Jeanrenz
 */
import java.util.HashMap;

import java.util.HashSet;
public class Javapp {

    public static void main(String[] args) {
        HashSet<String> branch = new HashSet<>();
        
        branch.add("Makati");
        branch.add("Manila");
        branch.add("Alabang");
        System.out.println("--- HASHSET ---");
        System.out.println("FEU Branches: " + branch);
        branch.add("Cavite");
        System.out.println("After adding a branch:  " + branch);
        branch.contains("Manila");
        System.out.println("Does it contain manila branch?: " + branch.contains("Manila"));
        System.out.println("Number of branches: " + branch.size());
        
        
       
        
    }
}
