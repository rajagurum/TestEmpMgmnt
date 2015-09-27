/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.core;

/**
 *
 * @author rajaguru
 */
public class DrizzlyException extends Exception{
    
    public DrizzlyException(){
        super();
    }
    
    public DrizzlyException(String msg,Throwable t){
        super(msg,t);
    }
    
    public DrizzlyException(String msg){
        super(msg);
    }
}
