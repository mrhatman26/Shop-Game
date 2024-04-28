package com.gdx.shopgame;

import com.badlogic.gdx.Gdx;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.File;
import java.util.Scanner;

public class MovePointTranslator {
    private static String movePointList;
    private static File movePointsFile;
    private static Scanner fileScanner;
    private static String className = Thread.currentThread().getStackTrace()[1].getClassName().replace("com.mygdx.autofarm.", "");

    public static boolean readFile(){
        try{
            movePointsFile = Gdx.files.internal("Move Points.txt").file();
            fileScanner = new Scanner(movePointsFile);
            movePointList = "";
            while(fileScanner.hasNextLine()){
                if (movePointList.equals("")){
                    movePointList = fileScanner.nextLine();
                }
                else{
                    movePointList = movePointList + "+" + fileScanner.nextLine();
                }
            }
            fileScanner.close();
            StaticMethods.systemMessage(className, Thread.currentThread().getStackTrace()[1].getMethodName(), "movePointList is:\n" + movePointList.replace("+", "\n"), true);
            return true;
        }
        catch (Exception error){
            StaticMethods.systemMessage(className, Thread.currentThread().getStackTrace()[1].getMethodName(), "An error occurred when trying to read 'Move Points.txt", true);
            error.printStackTrace();
            return false;
        }
    }

    public static boolean translateMovePoints(MovePointHandler movePointHandler){
        try{
            String[] movePointListSplit = movePointList.split("\\+");
            for (int i = 0; i < movePointListSplit.length; i++){
                String[] movePointItems = movePointListSplit[i].split(" ");
                StaticMethods.systemMessage(className, Thread.currentThread().getStackTrace()[1].getMethodName(), "movePointListSplit[" + i + "] is: " + movePointListSplit[i], true);
                movePointHandler.createMovePoint(Integer.parseInt(movePointItems[0]), Integer.parseInt(movePointItems[1]), Boolean.parseBoolean(movePointItems[2]), Boolean.parseBoolean(movePointItems[3]), Boolean.parseBoolean(movePointItems[4]), Boolean.parseBoolean(movePointItems[5]));
            }
            return true;
        }
        catch (Exception error){
            StaticMethods.systemMessage(className, Thread.currentThread().getStackTrace()[1].getMethodName(), "An error occured when trying to translate MovePoints from 'Move Points.txt'", true);
            error.printStackTrace();
            return false;
        }
    }
}
