package com.wpg.platformer.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.wpg.platformer.PlatformerGame;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public abstract class BaseScreen implements Screen {

	final private PlatformerGame game;

	final private OrthographicCamera camera;

	public BaseScreen(final PlatformerGame game) {

		this.game = game;

		this.camera = new OrthographicCamera();
		this.camera.setToOrtho(false, 1280, 720); // TODO Get this from configuration file.
	}
}
