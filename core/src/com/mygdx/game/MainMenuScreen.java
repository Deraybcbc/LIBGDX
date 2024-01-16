package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {
    private Drop game;
    private OrthographicCamera camera;

    public MainMenuScreen(Drop game){
        this.game = game;

        // Inicialitza i configura la càmera
        camera = new OrthographicCamera();
        camera.setToOrtho(false,800,480);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        // Esborra la pantalla amb color blanc
        Gdx.gl.glClearColor(0,0,0.2f,1);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Actualitza la càmera
        camera.update();

        // Configura el lot per utilitzar la càmera del Drop
        game.getSpriteBatch().setProjectionMatrix(camera.combined);

        // Inicia el lot
        game.getSpriteBatch().begin();

        // Dibuixa text en la pantalla del menú
        game.getBitmapFont().draw(((Drop) game).getSpriteBatch(),"hacer clic en la pantalla",100,150);

        //Finaliza el lot
       game.getSpriteBatch().end();

        //Comprova si s'ha fet clic
        if(Gdx.input.isTouched()){
            game.setScreen(new MyGdxGame(game));
            dispose();
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
