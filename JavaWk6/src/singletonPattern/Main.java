
package singletonPattern;

public class Main {
    
    public static void main(String[] args) {
       
        Singleton x = Singleton.getInstance();
        
        Singleton y = Singleton.getInstance();
        
        Singleton z = Singleton.getInstance();
        
        
        x.s = (x.s).toUpperCase();
        
        System.out.println("String from x is " + x.s);
        System.out.println("String from x is " + y.s);
        System.out.println("String from x is " + z.s);
        
        z.s = (z.s).toLowerCase();
        
        System.out.println("String from x is " + x.s);
        System.out.println("String from x is " + y.s);
        System.out.println("String from x is " + z.s);
        
        y.s = (y.s).replace("this", "there");
        System.out.println("String from y is " + y.s);
        
        y.s = (y.s).replace("singleton", "toto");
        
        System.out.println("String from y is " + y.s);
        
        
        
    }
    
}
