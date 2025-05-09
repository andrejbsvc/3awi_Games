package at.andrej.Games_Programmieren.snowworld;

import at.andrej.Games_Programmieren.games.firstgame.RectanglesGame;
import org.newdawn.slick.*;

public class Snowworld extends BasicGame {


    public Snowworld(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

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


