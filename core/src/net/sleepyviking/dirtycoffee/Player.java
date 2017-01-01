package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by The Plank on 2016-06-23.
 */
public class Player extends Entity{

    private int score;
    private String name;
    public Sprite sprite;
    public Vector2 position;
    public int speed = 10;
    public int xVelocity = 0;
    public int yVelocity = 0;

    Player(String playerName, Vector2 playerPosition){
        name = playerName;
        score = 0;
        position = playerPosition;
    }

    public void setPosition(Vector2 playerPosition){position = playerPosition;}
    public void changeXPosition(int multiplier) {
        position.x += speed * multiplier;
        sprite.setPosition(position.x, position.y);
    }
    public void changeYPosition(int multiplier) {
        position.y += speed * multiplier;
        sprite.setPosition(position.x, position.y);
    }
    public Vector2 getPosition() {return position;}

    public void changeXVelocity(int multiplier){
        xVelocity = multiplier;
    }
    public void changeYVelocity(int multiplier){
        yVelocity = multiplier;
    }
    public void move(){
        changeXPosition(xVelocity);
        changeYPosition(yVelocity);
        sprite.setPosition(position.x, position.y);
    }
    public void setSpeed(int playerSpeed) {speed = playerSpeed;}
    public int getSpeed() {return speed;}
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
