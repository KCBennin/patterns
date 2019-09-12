
package observerPattern;

import java.util.Observable;
import java.util.Random;

public class Game extends Observable implements Runnable {
    
    private String name;
    private String score;
    private int teamAscore;
    private int teamBscore;
    private boolean teamAHasBall;
    private Random random;
    
    public Game(String name) {
        super();
        this.name = name;
        random = new Random();
        
    }
    
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
        setChanged();
        notifyObservers(score);
    }

    public int getTeamAscore() {
        return teamAscore;
    }

    public void setTeamAscore(int teamAscore) {
        this.teamAscore = teamAscore;
    }

    
    public int getTeamBscore() {
        return teamBscore;
    }

    public void setTeamBscore(int teamBscore) {
        this.teamBscore = teamBscore;
    }

   
    public boolean isTeamAHasBall() {
        return teamAHasBall;
    }

    
    public void setTeamAHasBall(boolean teamAHasBall) {
        this.teamAHasBall = teamAHasBall;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
    
    
    @Override
    public void run() {
        
        while(true) {
            
           if(teamAHasBall) {
               setTeamAscore(teamAscore + random.nextInt(3));
           }
           else {
               setTeamBscore(teamBscore + random.nextInt(3));
               
           }
           teamAHasBall = !teamAHasBall;
           setScore(teamAscore + ":" + teamBscore);
           
           try {
               Thread.sleep(2000);
               
           } catch (InterruptedException e) {
               e.printStackTrace();
           
           } 
        
        }
        
      }
        
        @Override
        public String toString() {
        
        return this.name;
    }
        
    }

    
   
