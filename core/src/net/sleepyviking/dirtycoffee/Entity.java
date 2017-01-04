package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Dauas on 6/26/2016.
 */
public class Entity {

    private int maxhealth;
    private int health;
    private int weight;
    private int resistance;
    private int speed;
    public Vector2 position;
    public Vector2 velocity;
    private String name;
    private String spritename;
    public Sprite sprite;

    public int getMaxHealth(){
        return maxhealth;
    }
    public void setMaxHealth(int n){
        maxhealth = n;
    }
    public void incMaxHealth(int n){
        maxhealth += n;
    }
    public void decMaxHealth(int n){
        maxhealth -= n;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int n){
        maxhealth = n;
    }
    public void incHealth(int n){
        health += n;
    }
    public void decHealth(int n){
        health -= n;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int n){
        weight = n;
    }
    public void incWeight(int n){
        weight += n;
    }
    public void decWeight(int n){
        weight -= n;
    }

    public int getResistance(){
        return resistance;
    }
    public void setResistance(int n){
        resistance = n;
    }
    public void incResistance(int n){
        resistance += n;
    }
    public void decResistance(int n){
        resistance -= n;
    }

    public Vector2 getPosition(){
        return position;
    }
    public void setPosition(Vector2 n) {
        position.set(n);
    }
    public void setPosition(float x, float y) {
        position.set(x, y);
    }

    public void changeXPosition(float multiplier) {
        position.x += speed * multiplier;
        //sprite.setPosition(position.x, position.y);
    }
    public void changeYPosition(float multiplier) {
        position.y += speed * multiplier;
        //sprite.setPosition(position.x, position.y);
    }

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
    }
}
