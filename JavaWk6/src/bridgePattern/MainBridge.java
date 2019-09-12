
package bridgePattern;

public class MainBridge {

    public static void main(String[] args) {
       
        Circle c = new Circle();
        c.drawCircle();
        c.draw();
        c.colorCircle();
        
        DrawRed r = new DrawRed();
        r.colorCircle();
        
        Triangle t = new Triangle();
        t.draw();
        t.doubleTriangle();
       
        
        
    }
    
}
