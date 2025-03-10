package at.andrej.Games_Programmieren.Aufgabe_03;

import at.andrej.Games_Programmieren.games.firstgame.RectanglesGame;
import org.newdawn.slick.*;

public class MovingObjects extends BasicGame {

    private float x;
    private float y;
    private float a;
    private float b;
    private float speed;



    public MovingObjects() {
        super("MovingObjects");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

      this.speed = 2f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.y += (float)delta/this.speed;

        if(this.y > 600) {
            this.y = 200;

        }

        this.a += (float)delta/this.speed;

        if(this.a > 800) {
            this.b = 300;

        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawOval(this.x, this.y, 100, 100);
        graphics.drawOval(200, 10, 60, 30);
        graphics.drawRect(this.a, this.b, 100, 100);


    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MovingObjects());
            container.setDisplayMode(1000,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}


