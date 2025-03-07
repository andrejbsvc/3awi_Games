package at.andrej.Games_Programmieren.Aufgabe_03;

import at.andrej.Games_Programmieren.games.firstgame.RectanglesGame;
import org.newdawn.slick.*;

public class MovingObjects extends BasicGame {

    private float x;
    private float y;


    public MovingObjects() {
        super("MovingObjects");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawOval(100, 100, 100, 100);
        graphics.drawOval(100, 100, 100, 100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RectanglesGame());
            container.setDisplayMode(1200,700,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}


