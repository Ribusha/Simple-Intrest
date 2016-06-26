/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.simpleintrest;

/**
 *
 * @author MUKESH
 */
public class SimpleIntrest {
    
    double Principle,Rate,Time,result;
    
    public double SimpleIntrest(double Principle,double Rate,double Time )
    {
    result = ((Principle*Time*Rate)/100);
    return result;
    
        
    }
    
}
