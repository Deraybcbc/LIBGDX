package com.mygdx.game;

<<<<<<< HEAD
=======
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
>>>>>>> 25c08d6 (Juego Terminado(Opcional mejoras))
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
<<<<<<< HEAD
=======

>>>>>>> 25c08d6 (Juego Terminado(Opcional mejoras))
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Drop");
		config.setWindowedMode(800, 480);
		config.useVsync(true);
		config.setForegroundFPS(60);
<<<<<<< HEAD
		new Lwjgl3Application(new MyGdxGame(), config);
=======

		// Crea una instancia de la clase Drop y pásala al constructor de MainMenuScreen
		Drop game = new Drop();
		new Lwjgl3Application(game, config);
>>>>>>> 25c08d6 (Juego Terminado(Opcional mejoras))
	}
}
