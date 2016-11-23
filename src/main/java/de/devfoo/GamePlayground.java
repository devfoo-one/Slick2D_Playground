package de.devfoo;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;


public class GamePlayground extends BasicGame {

    private static Input in;
    private static int x;
    private static int y;

    public void init(GameContainer gameContainer) throws SlickException {
        in = gameContainer.getInput();
        x = 300;
        y = 300;
    }

    public void update(GameContainer gameContainer, int i) throws SlickException {
        if (in.isKeyDown(Input.KEY_UP) || in.isKeyDown(Input.KEY_W)) {
            y -= 3;
        }
        if (in.isKeyDown(Input.KEY_DOWN) || in.isKeyDown(Input.KEY_S)) {
            y += 3;
        }
        if (in.isKeyDown(Input.KEY_LEFT) || in.isKeyDown(Input.KEY_A)) {
            x -= 3;
        }
        if (in.isKeyDown(Input.KEY_RIGHT) || in.isKeyDown(Input.KEY_D)) {
            x += 3;
        }
    }

    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.setColor(Color.green);
        graphics.fillOval(x, y, 10, 10);

    }

    private GamePlayground(String title) {
        super(title);
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new GamePlayground("GamePlayground"));
        app.setDisplayMode(600, 600, false);
        app.setTargetFrameRate(60);
        app.setVSync(true);
        app.setShowFPS(false);
        app.start();

    }
}
