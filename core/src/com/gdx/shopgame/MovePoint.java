package com.gdx.shopgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.w3c.dom.css.Rect;

import java.awt.*;

public class MovePoint {
    private Texture movePointTexture;
    private Rectangle movePointRectangle;
    private boolean[] moveableDirections;
    MovePoint(int x, int y, boolean moveLeft, boolean moveRight, boolean moveUp, boolean moveDown){
        this.movePointTexture = StaticMethods.spriteTest(Gdx.files.internal("spr_move_point.png"));
        this.movePointRectangle = new Rectangle();
        this.movePointRectangle.width = movePointTexture.getWidth();
        this.movePointRectangle.height = movePointTexture.getHeight();
        this.movePointRectangle.x = x;
        this.movePointRectangle.y = y;
        this.moveableDirections = new boolean[]{moveLeft, moveRight, moveUp, moveDown};
    }

    public Rectangle getRect(){
        return this.movePointRectangle;
    }

    public void update(SpriteBatch spriteBatch){
        spriteBatch.draw(movePointTexture, movePointRectangle.x, movePointRectangle.y);
    }

    public void dispose(){
        movePointTexture.dispose();
    }
}
