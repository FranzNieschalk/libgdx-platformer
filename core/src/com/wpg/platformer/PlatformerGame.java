package com.wpg.platformer;

import com.badlogic.gdx.Game;
import com.wpg.platformer.screens.MainMenuScreen;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public class PlatformerGame extends Game {

	@Override
	public void create() {

		this.setScreen(new MainMenuScreen(this));
	}
}
