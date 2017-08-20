package com.wpg.platformer.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.wpg.platformer.PlatformerGame;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public abstract class BaseScreen implements Screen {

	final protected PlatformerGame game;
	final protected OrthographicCamera camera;

	public BaseScreen(final PlatformerGame game) {

		this.game = game;
		this.camera = new OrthographicCamera();
		this.camera.setToOrtho(false, 1280, 720); // TODO Get this from configuration file.
	}

	@Override
	public void render(float delta) {

		this.camera.update();

		// draw the background color
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
}
