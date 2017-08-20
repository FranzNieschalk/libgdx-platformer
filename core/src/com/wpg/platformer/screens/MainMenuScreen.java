package com.wpg.platformer.screens;

import com.wpg.platformer.PlatformerGame;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public class MainMenuScreen extends MenuScreen {

	public MainMenuScreen(PlatformerGame game) {

		super(game);
	}

	@Override
	public void show() {

		// TODO Remove automatic switch to world screen.
		this.game.setScreen(new TestWorldScreen(this.game));
	}

	@Override
	public void render(float delta) {

		super.render(delta);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}
}
