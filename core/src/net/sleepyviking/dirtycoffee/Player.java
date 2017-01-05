package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by The Plank on 2016-06-23.
 */
public class Player extends Entity{

    private int score;
    private String name;
    //public Sprite sprite;
    public Vector2 position;
    public Vector2 velocity;
    public Vector2 camVelocity;
    public int speed = 10;
    public int camSpeed = 5;
    public OrthographicCamera camera;
    public boolean tryCamCenter = true;

    Player(String playerName, Vector2 playerPosition, OrthographicCamera playerCamera){
        name = playerName;
        score = 0;
        position = playerPosition;
        velocity = new Vector2(0, 0);
        camVelocity = new Vector2(0, 0);
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
        camera.translate(camVelocity.x * speed, camVelocity.y * speed);
        camera.update();
        centerCamera();

    }

    public void changeCamXVelocity(int multiplier){
        camVelocity.x = multiplier;
    }

    public void changeCamYVelocity(int multiplier){
        camVelocity.y = multiplier;
    }

    public void centerCamera(){
        if (camera.position != new Vector3(position.x, position.y, 0) && tryCamCenter == true) {
            float xOff = position.x - camera.position.x;
            float yOff = position.y - camera.position.y;
            camera.translate(xOff/10, yOff/10);
            camera.update();
        }

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
