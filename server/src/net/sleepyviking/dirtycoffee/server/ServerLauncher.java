package net.sleepyviking.dirtycoffee.server;

import com.badlogic.gdx.backends.headless.*;
import net.sleepyviking.dirtycoffee.DirtyCoffee;

public class ServerLauncher {
	public static void main (String[] arg) {
		HeadlessApplicationConfiguration config = new HeadlessApplicationConfiguration();
		new HeadlessApplication(new DirtyCoffee(), config);
	}
}
