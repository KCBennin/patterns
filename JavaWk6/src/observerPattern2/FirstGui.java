
package observerPattern2;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class FirstGui extends JFrame implements ActionListener {
    
private JButton advertButton;
private JButton orderButton;
private JButton cancelButton;

private JLabel title;
  
public FirstGui() { 
    super("IT VALLEY");
    setLayout(new FlowLayout());
    
    //title = new JLabel("Welcome");
    //title.setToolTipText("Please select");
    //add(title);
  
  //FirstGui gui = new FirstGui();
  
  advertButton = new JButton("CREATE ADVERT");
  
  orderButton = new JButton("CREATE ORDER");
  
  cancelButton = new JButton("CREATE MAGAZINE");
  
  
  
  /*
  setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
  
        add(advertButton, gc);
        add(orderButton, gc);
        
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        
    */    
  
        add(advertButton);
        add(orderButton);
        add(cancelButton);
        advertButton.addActionListener(this);
        orderButton.addActionListener(this);
        cancelButton.addActionListener(this);
        
        //anonymous class
        cancelButton.addActionListener(new ActionListener() {
            
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Alerts 2 observers of this action
             System.out.println("Your order has now been cancelled");
            
        }
            
        });
        
        //Window Gui
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
        setTitle("IT SYSTEMS");
  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton source = (JButton)e.getSource();
        
        if(source == advertButton) {
         
            System.out.println("Client creates advert");
            
        }else if(source == orderButton) {            
            
            System.out.println("Client makes order");
        
        }else if(source == cancelButton) {            
            
            System.out.println("Client cancels order");
        }
      
    }    
    
}
  


