package com.gdx.shopgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class Player {
    private Texture playerSprite;
    private Rectangle playerRect;
    Player(){
        playerSprite = StaticMethods.spriteTest(Gdx.files.internal("spr_player.png"));
        playerRect = new Rectangle();
        playerRect.width = playerSprite.getWidth();
        playerRect.height = playerSprite.getHeight();
        playerRect.x = 64; //Temp!
        playerRect.y = 64;
    }

    public void update(SpriteBatch spriteBatch){
        spriteBatch.draw(playerSprite, playerRect.x, playerRect.y);
    }

    public void dispose(){
        playerSprite.dispose();
    }
}
