package net.sleepyviking.dirtycoffee;

import net.sleepyviking.dirtycoffee.DirtyCoffee;
import net.sleepyviking.dirtycoffee.Player;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by Dauas on 12/31/2016.
 */
public class InputManager implements InputProcessor {

    Player player;

    InputManager(Player playerID) {
        player = playerID;
    }

    public boolean keyDown (int keycode) {

            switch (keycode) {
                case Keys.A:
                    player.changeXVelocity(-1);
                    System.out.println("LEFT has been pressed.");
                    player.tryCamCenter = true;

                    break;
                case Keys.D:
                    player.changeXVelocity(1);
                    System.out.println("RIGHT has been pressed.");
                    player.tryCamCenter = true;
                    break;

                case Keys.S:
                    player.changeYVelocity(-1);
                    System.out.println("UP has been pressed.");
                    player.tryCamCenter = true;
                    break;

                case Keys.W:
                    player.changeYVelocity(1);
                    System.out.println("DOWN has been pressed.");
                    player.tryCamCenter = true;
                    break;

                case Keys.UP:
                    player.tryCamCenter = false;
                    player.changeCamYVelocity(1);
                    break;

                case Keys.LEFT:
                    player.tryCamCenter = false;
                    player.changeCamXVelocity(-1);
                    break;

                case Keys.DOWN:
                    player.tryCamCenter = false;
                    player.changeCamYVelocity(-1);
                    break;

                case Keys.RIGHT:
                    player.tryCamCenter = false;
                    player.changeCamXVelocity(1);
                    break;


                default:
                    System.out.println("Unidentified Key Pressed");
                    return false;
            }
            return false;
    }

    public boolean keyUp (int keycode) {
        switch (keycode) {
            case Keys.A:
                player.changeXVelocity(0);
                System.out.println("LEFT has been released.");

                break;
            case Keys.D:
                player.changeXVelocity(0);
                System.out.println("RIGHT has been released.");
                break;

            case Keys.S:
                player.changeYVelocity(0);
                System.out.println("UP has been released.");
                break;

            case Keys.W:
                player.changeYVelocity(0);
                System.out.println("DOWN has been released.");
                break;

            case Keys.UP:
                //player.tryCamCenter = true;
                player.changeCamYVelocity(0);
                break;

            case Keys.LEFT:
                //player.tryCamCenter = true;
                player.changeCamXVelocity(0);
                break;

            case Keys.DOWN:
                //player.tryCamCenter = true;
                player.changeCamYVelocity(0);
                break;

            case Keys.RIGHT:
                //player.tryCamCenter = true;
                player.changeCamXVelocity(0);
                break;
        }
        return false;
    }

    public boolean keyTyped (char character) {
        return false;
    }

    public boolean touchDown (int x, int y, int pointer, int button) {
        return false;
    }

    public boolean touchUp (int x, int y, int pointer, int button) {
        return false;
    }

    public boolean touchDragged (int x, int y, int pointer) {
        return false;
    }

    public boolean mouseMoved (int x, int y) {
        return false;
    }

    public boolean scrolled (int amount) {
        return false;
    }
}
