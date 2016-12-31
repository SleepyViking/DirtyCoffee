package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
//import com.badlogic.gdx.graphics;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class DirtyCoffee extends ApplicationAdapter {
int winHeight;
int winWidth;
//int i = 0;
long startTime;
private SpriteBatch batch;
private Texture img;
private Sprite sprite;
private TextureRegion[] alliance;
private int xCenter;
private int yCenter;

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
		sprite = new Sprite(img);
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
		/**Resets Background for redrawing
		 * Prevents
		 **/
			Gdx.gl.glClearColor(1, 1, 1, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			batch.begin();
			/**Draw Everything in Here, Stop Drawing before batch.end()**/
			batch.draw(sprite, xCenter - img.getWidth()/2, yCenter - img.getHeight()/2); //Dependent on Error in line 19
			batch.draw(alliance[0], 0,0);
			batch.draw(alliance[1], 50,0);
			batch.draw(alliance[2], 100,0);
			batch.draw(alliance[3], 150,0);
			/**Stop Drawing**/
			batch.end();

	}

	public void log(String s){
		System.out.println(System.currentTimeMillis() + ":  " + s);
	}

}
