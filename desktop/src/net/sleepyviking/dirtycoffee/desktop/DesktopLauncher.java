package net.sleepyviking.dirtycoffee.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.sleepyviking.dirtycoffee.DirtyCoffee;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Dirty Coffee";
		config.width = 480;
		config.height = 320;
		config.addIcon("iconDirtyCoffee.png", Files.FileType.Internal);

		new LwjglApplication(new DirtyCoffee(), config);
	}
}
