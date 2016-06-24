package net.sleepyviking.dirtycoffee;

/**
 * Created by The Plank on 2016-06-23.
 */
public class Player{

    private int score;

    public void setScore(int s){
        score = s;
    }
    public void incScore(){
        score++;
    }
    public void incScore(int s){
        score += s;
    }
    public void decScore(){
        score--;
    }
    public void decScore(int s){
        score -= s;
    }
    public int getScore(){
        return score;
    }

}
