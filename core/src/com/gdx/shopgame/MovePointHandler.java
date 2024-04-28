package com.gdx.shopgame;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

public class MovePointHandler {
    private Array<MovePoint> movePoints;
    MovePointHandler(){
        this.movePoints = new Array<MovePoint>();
        MovePointTranslator.readFile();
        MovePointTranslator.translateMovePoints(this);
    }

    public void createMovePoint(int x, int y, boolean moveLeft, boolean moveRight, boolean moveUp, boolean moveDown){
        movePoints.add(new MovePoint(x, y, moveLeft, moveRight, moveUp, moveDown));
    }

    public void update(SpriteBatch spriteBatch){
        for (MovePoint movePoint: movePoints){
            movePoint.update(spriteBatch);
        }
    }

    public void dispose(){
        for (MovePoint movePoint: movePoints){
            movePoint.dispose();
        }
    }
}
