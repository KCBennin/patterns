
package singletonPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
    
    //static variable singleInstance of type Singleton
    private static Singleton singleInstance = null;
    
    
    //variable of type String
    public String s;
    
    private Singleton()  {
        
        s = "This is a SINGLETON PATTERN";
    }
    
    public static Singleton getInstance() {
        
        if (singleInstance == null)
            singleInstance = new Singleton();
        
        return singleInstance;
    }
    
}
        
   
    

