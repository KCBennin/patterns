
package observerPattern;

import java.util.Vector;

public class Test {
    
    public static void main(String[] args) {
        
        Game game1 = new Game("Liverpool-FC");
        Game game2 = new Game("Everton-FC");
        Game game3 = new Game("Arsenal-FC");
        
        Vector<Game> games = new Vector<Game>();
        
        games.add(game1);
        games.add(game2);
        games.add(game3);
        
        new Thread(game1).start();
        new Thread(game2).start();
        new Thread(game3).start();
        
        Viewer viewer1 = new Viewer("John", games);
        Viewer viewer2 = new Viewer("David", games);
    
    
    
    }
    
}
