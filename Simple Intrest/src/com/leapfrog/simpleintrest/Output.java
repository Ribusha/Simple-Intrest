/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.simpleintrest;

import java.util.Scanner;

/**
 *
 * @author MUKESH
 */
public class Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Principle,Rate,Time,SimpleIntrest;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Principle");
        Principle = input.nextDouble();
        
        System.out.println("Rate");
        Rate = input.nextDouble();
        
        System.out.println("Time");
        Time = input.nextDouble();
        
        SimpleIntrest = ((Principle*Time*Rate)/100);
        System.out.println("Simple Intrest"+ SimpleIntrest );
        SimpleIntrest si= new SimpleIntrest();
        si.SimpleIntrest(Principle, Rate, Time);
        
            
        }
    }
    

