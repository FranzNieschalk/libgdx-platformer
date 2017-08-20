package com.wpg.platformer.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.wpg.platformer.PlatformerGame;
import com.wpg.platformer.entities.BaseEntity;

/**
 * Created by Franz Nieschalk on 18.08.2017.
 */

public class TestWorldScreen extends WorldScreen {

	BaseEntity testEntity1;
	BaseEntity testEntity2;
	BaseEntity testEntity3;

	public TestWorldScreen(PlatformerGame game) {

		super(game);

		// create a ground
		BodyDef groundBodyDef = new BodyDef();
		groundBodyDef.position.set(new Vector2(this.camera.viewportWidth / 2, 10.0f));
		Body groundBody = this.world.createBody(groundBodyDef);
		PolygonShape groundBox = new PolygonShape();
		groundBox.setAsBox(this.camera.viewportWidth / 2, 10.0f);
		groundBody.createFixture(groundBox, 0.0f);
		groundBox.dispose();

		Texture testTexture = new Texture("badlogic.jpg");
		this.testEntity1 = new BaseEntity(this.world, testTexture, 0.0f, 20.0f);
		this.testEntity2 = new BaseEntity(this.world, testTexture, 500.0f, 50.0f);
		this.testEntity3 = new BaseEntity(this.world, testTexture, 1000.0f, 170.0f);
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {

		super.render(delta);

		this.testEntity1.render();
		this.testEntity2.render();
		this.testEntity3.render();

		// render the physics
		this.renderPhysics(delta);
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

		this.world.dispose();
	}
}
