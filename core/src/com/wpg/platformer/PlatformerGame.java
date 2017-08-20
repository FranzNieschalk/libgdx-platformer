package com.wpg.platformer;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.wpg.platformer.screens.MainMenuScreen;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public class PlatformerGame extends Game {

	@Override
	public void create() {

		// initialize modules
		Box2D.init();

		// start with the first screen
		this.setScreen(new MainMenuScreen(this));
	}
}
