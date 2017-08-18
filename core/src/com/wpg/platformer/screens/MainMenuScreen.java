package com.wpg.platformer.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.wpg.platformer.PlatformerGame;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public class MainMenuScreen extends BaseScreen {

	SpriteBatch spriteBatch;

	Texture texture;

	public MainMenuScreen(PlatformerGame game) {

		super(game);

		spriteBatch = new SpriteBatch();
		texture = new Texture("badlogic.jpg");
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		// TODO Get this from configuration file.
		spriteBatch.begin();
		spriteBatch.draw(texture, (1280 - texture.getWidth()) / 2, (720 - texture.getHeight()) / 2);
		spriteBatch.end();
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

		spriteBatch.dispose();
		texture.dispose();
	}
}
