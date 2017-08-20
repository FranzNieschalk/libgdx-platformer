package com.wpg.platformer.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Franz Nieschalk on 20.08.2017.
 */

public class BaseEntity {

	protected SpriteBatch spriteBatch;
	protected Sprite sprite;
	protected Body body;

	public BaseEntity(World world, Texture texture, float x, float y) {

		// draw the sprite with its texture
		this.spriteBatch = new SpriteBatch();
		this.sprite = new Sprite(texture);
		this.sprite.setPosition(x, y);

		// define a new body in the world
		BodyDef bodyDef = new BodyDef();
		bodyDef.position.set(this.sprite.getX() + this.sprite.getWidth() / 2, this.sprite.getY() + this.sprite.getHeight() / 2);
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		this.body = world.createBody(bodyDef);

		// give the new body a box-shape
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(this.sprite.getWidth() / 2, this.sprite.getHeight() / 2);
		this.body.createFixture(shape, 1.0f);
		shape.dispose();
	}

	public void render() {

		// bind all physic changes to the sprite
		this.sprite.setCenter(this.body.getPosition().x, this.body.getPosition().y);
		this.spriteBatch.begin();
		this.spriteBatch.draw(this.sprite, this.sprite.getX(), this.sprite.getY());
		this.spriteBatch.end();
	}

	public void dispose() {

		this.spriteBatch.dispose();
	}
}
