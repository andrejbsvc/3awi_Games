package at.andrej.Games_Programmieren.Aufgabe_03;

import at.andrej.Games_Programmieren.games.firstgame.RectanglesGame;
import org.newdawn.slick.*;

public class MovingObjects extends BasicGame {

    private float x;
    private float y;
    private float xa;
    private float yb;
    private float xd;
    private float yd;
    private float speed;

    private enum DIRECTION {
        UP, DOWN, RIGHT, LEFT
    }

    private DIRECTION directionOvalUpDown = DIRECTION.DOWN;
    private DIRECTION directionRectangle = DIRECTION.RIGHT;
    private DIRECTION directionOvalRightLeft = DIRECTION.RIGHT;//


    public MovingObjects() {
        super("MovingObjects");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.speed = 1f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        //Oval UP and Down
        if (directionOvalUpDown == DIRECTION.DOWN) {
            this.y += (float) delta / this.speed;

            if (this.y > 700) {
                this.directionOvalUpDown = DIRECTION.UP;

            }
        }

        if (directionOvalUpDown == DIRECTION.UP) {
            this.y -= (float) delta / this.speed;

            if (this.y < 100) {
                this.directionOvalUpDown = DIRECTION.DOWN;
            }
        }


        // Rectangle

        if (directionRectangle == DIRECTION.RIGHT) {

            this.xa += (float) delta / this.speed;

            if (this.xa > 800) {
                this.directionRectangle = DIRECTION.DOWN;
            }

        }

        if (directionRectangle == DIRECTION.DOWN) {
            this.yb += (float) delta / this.speed;

            if (this.yb > 600) {
                this.directionRectangle = DIRECTION.LEFT;
            }
        }

        if (directionRectangle == DIRECTION.LEFT) {
            this.xa -= (float) delta / this.speed;

            if (this.xa < 100) {
                this.directionRectangle = DIRECTION.UP;
            }
        }

        if (directionRectangle == DIRECTION.UP) {
            this.yb -= (float) delta / this.speed;

            if (this.yb < 40) {
                this.directionRectangle = DIRECTION.RIGHT;
            }
        }



        //Oval Right and Left

        if (directionOvalRightLeft == DIRECTION.RIGHT) {
            this.xd += (float) delta / this.speed;

            if (this.xd > 800) {
                this.directionOvalRightLeft = DIRECTION.LEFT;
            }
        }

        if (directionOvalRightLeft == DIRECTION.LEFT) {
            this.xd -= (float) delta / this.speed;

            if (this.xd < 20) {
                this.directionOvalRightLeft = DIRECTION.RIGHT;
            }
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawOval(this.x, this.y, 100, 100);
        graphics.drawOval(this.xd, this.yd, 60, 30);
        graphics.drawRect(this.xa, this.yb, 100, 100);


    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MovingObjects());
            container.setDisplayMode(1000, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}


