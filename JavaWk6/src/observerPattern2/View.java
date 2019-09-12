
package observerPattern2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class View extends JFrame{
    
    private String model;
    private JButton advertButton;
    
    public static void main(String[] args) {
    
    
    }


    
    
    public View(String model) {
        super("kuuku");
        
        this.model = model;
        
        //GUI Button
        advertButton = new JButton("CREATEADVERT");
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridheight = 0;
        gc.gridwidth = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        
        add(advertButton, gc);
        
        
    }
    
    
    
    
    
    
    
}
