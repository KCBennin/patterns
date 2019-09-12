
package facadePattern;

public class MainFacade {
    
    public static void main(String[] args) {
        
       ShapeMakerFacade smf = new ShapeMakerFacade();
        smf.drawCircle();
        smf.drawRectangle();
        smf.drawSquare();
        
        
    }
    
}
