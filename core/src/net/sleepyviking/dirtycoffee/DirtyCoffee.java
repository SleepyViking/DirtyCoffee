package net.sleepyviking.dirtycoffee;

import com.badlogic.gdx.ApplicationAdapter;

public class DirtyCoffee extends ApplicationAdapter {

	@Override
	public void create () {
		log("Creating Application...");



		log("Done.");
	}

	/**
	 * Da main loop
	 * */
	@Override
	public void render () {



	}

	public void log(String s){
		System.out.println(System.currentTimeMillis() + ":  " + s);
	}

}
