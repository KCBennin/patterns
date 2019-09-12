
package observerPattern;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Viewer extends JFrame implements Observer, ActionListener {
    
    private JLabel scoreLabel;
    private JLabel nameLabel;
    private JPanel panel;
    private JComboBox combo;
    private Vector<Game> games;
    private Game currentGame;
    
    //constructor and interface
public Viewer(String name, Vector<Game> games) {
    
    this.games = games;
    this.setTitle(name);
    this.setVisible(true);
    this.setSize(500, 300);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    nameLabel = new JLabel("Match");
    nameLabel.setFont(new Font ("Arial", 1, 50));
    
    scoreLabel = new JLabel("Score");
    scoreLabel.setFont(new Font("Arial", 1, 80));
    
    panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    
    combo = new JComboBox(games);
    combo.setFont(new Font("Arial", 0, 30));
    combo.addActionListener(this);
    
    this.add(panel);
    panel.add(nameLabel);
    panel.add(scoreLabel);
    panel.add(combo);
    
  }    

    @Override
    public void update(Observable o, Object arg) {
        String score = (String)arg;
        this.scoreLabel.setText(score);
    }    
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Game selected = (Game)((JComboBox)e.getSource()).getSelectedItem();
        this.nameLabel.setText(selected.getName());
        this.scoreLabel.setText(" ");
        
        if(currentGame != null)
           currentGame.deleteObserver(this);
           currentGame = selected;
           currentGame.addObserver(this);
        
    }
    
}
