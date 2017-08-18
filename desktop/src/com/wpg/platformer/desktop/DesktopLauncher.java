package com.wpg.platformer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.wpg.platformer.PlatformerGame;

public class DesktopLauncher {

	public static void main(String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		// TODO Get this from configuration file.
		config.title = "Platformer";
		config.width = 1280;
		config.height = 720;

		new LwjglApplication(new PlatformerGame(), config);
	}
}
