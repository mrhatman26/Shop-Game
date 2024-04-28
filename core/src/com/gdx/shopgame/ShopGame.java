package com.gdx.shopgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ShopGame extends ApplicationAdapter {
	SpriteBatch batch;
	Player player;
	MovePoint movePoint;
	public static boolean debug = false;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		player = new Player();
		movePoint = new MovePoint();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		player.update(batch);
		movePoint.update(batch);
		batch.end();
		StaticMethods.miscControls();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		player.dispose();
		movePoint.dispose();
	}
}
