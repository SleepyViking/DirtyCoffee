package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;


public class DirtyCoffee extends ApplicationAdapter {
private int winHeight;
private int winWidth;
private int playerXPosition = 0;
private int playerYPosition = 0;
private Vector2 playerVector = new Vector2(playerXPosition, playerYPosition);
private SpriteBatch batch;
private Texture img;
private Sprite sprite;
private TextureRegion[] alliance;
private int xCenter;
private int yCenter;
private InputAdapter input;

	@Override
	public void create () {
		log("Creating Application...");
		batch = new SpriteBatch();
		img = new Texture("allianceTokenSpritesheet.png");
		img.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		TextureRegion[][] tempSorting = TextureRegion.split(img,16, 16);
		alliance = new TextureRegion[4];
		int index = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				alliance[index++] = tempSorting[i][j];
			}
		}
		sprite = new Sprite(alliance[0]);
		sprite.setScale(5f);
		sprite.setX(0);
		sprite.setY(winHeight - sprite.getHeight());
		winWidth = Gdx.graphics.getWidth();
		winHeight = Gdx.graphics.getHeight();
		xCenter = winWidth/2;
		yCenter = winHeight/2;
		log("Width = "+ winWidth);
		log("Height = "+ winHeight);
		log("Done.");


	}

	public void dispose() {
		/**Handle's Closing procedure's, Called when Application is manually closed or at any Exit Point within the code**/
		log("Game is Closing...");
		batch.dispose();
		System.exit(0);
	}

	public void resize(int width, int height){
		/** Note: On resume() and on create(), resize() is called... **/
			if (winWidth != width) {
				log("New Width  = " + width + "px.");
				winWidth = width;
			}
			if (winHeight != height) {
				log("New Height = " + height + "px.");
				winHeight = height;
			}
	}

	public void pause() {
		/**Note: Program Pauses when the Close Button is pressed but never resumes**/
    	log("Program Paused");

	}

	public void resume() {
		log("Program Resumed");

	}

	/**
	 *
	 * Da main loop
	 *
	 * */
	@Override
	public void render () {
		if (Gdx.input.isKeyPressed(Keys.D)) {
			sprite.translateX(2);
		}
		if (Gdx.input.isKeyPressed(Keys.A)) {
			sprite.translateX(-2);
		}
		if (Gdx.input.isKeyPressed(Keys.W)) {
			sprite.translateY(2);
		}
		if (Gdx.input.isKeyPressed(Keys.S)) {
			sprite.translateY(-2);
		}
		if (Gdx.input.isKeyPressed(Keys.Q)){
			sprite.setScale(sprite.getScaleX() - .2f);
		}
		if (Gdx.input.isKeyPressed(Keys.E)){
			sprite.setScale(sprite.getScaleX() + .2f);
		}
		playerVector = new Vector2(playerXPosition, playerYPosition);

		/**Resets Background for redrawing
		 * Prevents
		 **/
			Gdx.gl.glClearColor(1, 1, 1, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			batch.begin();
			/**Draw Everything in Here, Stop Drawing before batch.end()**/
			sprite.draw(batch);
			batch.draw(img, xCenter - img.getWidth()/2, yCenter - img.getHeight()/2); //Dependent on Error in line 19
			batch.draw(alliance[0], 0, 0);
			batch.draw(alliance[1], 50, 0);
			batch.draw(alliance[2], 100,0);
			batch.draw(alliance[3], 150,0);
			/**Stop Drawing**/
			batch.end();

	}

	public void log(String s){
		System.out.println(System.currentTimeMillis() + ":  " + s);
	}

}
