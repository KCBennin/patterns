
package bridgePattern;

public class Triangle implements Shape {

    @Override
    public void draw() {
        
       System.out.println("TRIANGLE"); 
    }

    @Override
    public void drawCircle() {
        
    }

    @Override
    public void colorCircle() {
       
    }
    
    public void doubleTriangle() {
        System.out.println("DOUBLE TRIANGLE");
    }
    
}
