package at.andrej.Games_Programmieren.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.DeferredLoadingTest;

public class RectanglesGame extends BasicGame {

    private int x;

    public RectanglesGame(){
        super("Rectangles");
    }
    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.x = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        this.x++;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, 100, 100, 100);
        graphics.drawString("Hello you", 50, 50);
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
