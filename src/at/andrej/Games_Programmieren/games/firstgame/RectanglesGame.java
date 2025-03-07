package at.andrej.Games_Programmieren.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.DeferredLoadingTest;

public class RectanglesGame extends BasicGame {

    public RectanglesGame(){
        super("Rectangles");
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
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
