package com.gdx.shopgame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.gdx.shopgame.ShopGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Shop Game");
		//config.setWindowedMode(1920, 1080);
		config.setWindowedMode(1280, 720);
		config.useVsync(true);
		config.setResizable(false);
		new Lwjgl3Application(new ShopGame(), config);
	}
}
