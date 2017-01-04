package net.sleepyviking.dirtycoffee;


import com.badlogic.gdx.Gdx;

/**
 * Created by Dauas on 1/2/2017.
 */
public class LogicThread extends Thread{

    private DirtyCoffee game;

    LogicThread(DirtyCoffee thisGame){
        game = thisGame;
    }

    public void start(){


    }


    public void run() {
        game.log("Second thread is working");
    }

    public void updatePositions(float deltaTime, Entity[] Array){
        for (int i = 0; i < Array.length; i++) {
            Array[i].move();
        }
        //game.log("Delta Time"+deltaTime);
    }
}
