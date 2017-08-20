package com.wpg.platformer.screens;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.wpg.platformer.PlatformerGame;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public abstract class WorldScreen extends BaseScreen {

	static private final float GRAVITY = -9.81f; // the gravity in m/s^2

	public boolean debug = true;
	protected World world;
	protected Box2DDebugRenderer debugRenderer;

	public WorldScreen(PlatformerGame game) {

		super(game);

		this.world = new World(new Vector2(0, GRAVITY), true);
		this.debugRenderer = new Box2DDebugRenderer();
	}

	@Override
	public void render(float delta) {

		super.render(delta);
	}

	public void renderPhysics(float delta) {

		if(this.debug) {
			this.debugRenderer.render(this.world, this.camera.combined);
		}

		this.world.step(delta, 6, 2);
	}

	@Override
	public void dispose() {

		this.world.dispose();
	}
}
