package com.gdx.shopgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class MovePoint {
    private Texture movePointTexture;
    private Rectangle movePointRectangle;
    MovePoint(){
        movePointTexture = StaticMethods.spriteTest(Gdx.files.internal("spr_move_point.png"));
        movePointRectangle = new Rectangle();
        movePointRectangle.width = movePointTexture.getWidth();
        movePointRectangle.height = movePointTexture.getHeight();
        movePointRectangle.x = 128;
        movePointRectangle.y = 128;
    }

    public void update(SpriteBatch spriteBatch){
        spriteBatch.draw(movePointTexture, movePointRectangle.x, movePointRectangle.y);
    }

    public void dispose(){
        movePointTexture.dispose();
    }
}
