/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import core.ManipulationFile;


/**
 *
 * @author 20191bsi0077
 */
public class SerialNumberGeneratorTraditional {
    
    // Members
    private static SerialNumberGeneratorTraditional instance;
    
    public synchronized static SerialNumberGeneratorTraditional getInstance() {
        if(instance == null) {
            instance = new SerialNumberGeneratorTraditional();
        }
        
        return instance;
    }

    // Instance
    private int count;
    private ManipulationFile file = new ManipulationFile();

    // Constructor
    private SerialNumberGeneratorTraditional(){        
        count = file.getLastNumber();
    }
    
    // Methods
    public synchronized int getNextSerial() {
        return ++count;
    }   
}
