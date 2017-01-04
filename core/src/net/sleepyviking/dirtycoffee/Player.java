package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by The Plank on 2016-06-23.
 */
public class Player extends Entity{

    private int score;
    private String name;
    //public Sprite sprite;
    public Vector2 position;
    public Vector2 velocity;
    public int speed = 10;
    public OrthographicCamera camera;

    Player(String playerName, Vector2 playerPosition, OrthographicCamera playerCamera){
        name = playerName;
        score = 0;
        position = playerPosition;
        velocity = new Vector2(0, 0);
        setEntity();
        camera = playerCamera;

    }

    public void setEntity(){
        //this.Entity.position;
    }
    public void setPosition(Vector2 playerPosition){position = playerPosition;}

    public void changeXPosition(float multiplier) {
        position.x += speed * multiplier;
        sprite.setPosition(position.x, position.y);
    }
    public void changeYPosition(float multiplier) {
        position.y += speed * multiplier;
        sprite.setPosition(position.x, position.y);
    }
    public Vector2 getPosition() {return position;}

    public void changeXVelocity(int multiplier){
        velocity.x = multiplier;
    }
    public void changeYVelocity(int multiplier){
        velocity.y = multiplier;
    }
    public void move(){
        changeXPosition(velocity.x);
        changeYPosition(velocity.y);
        sprite.setPosition(position.x, position.y);
        camera.translate(velocity.x * speed, velocity.y * speed);
        camera.update();

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
