package com.gdx.shopgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ShopGame extends ApplicationAdapter {
	private SpriteBatch batch;
	public Player player;
	private MovePointHandler movePointHandler;
	private OrthographicCamera camera;
	public static boolean debug = true;

	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player();
		movePointHandler = new MovePointHandler();
		this.camera = new OrthographicCamera();
		this.camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		player.update(batch);
		movePointHandler.update(batch);
		batch.end();
		StaticMethods.miscControls();
		camera.update();
	}

	@Override
	public void dispose () {
		batch.dispose();
		player.dispose();
		movePointHandler.dispose();
	}
}
