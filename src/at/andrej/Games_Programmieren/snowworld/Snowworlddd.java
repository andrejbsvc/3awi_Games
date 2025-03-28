package at.andrej.Games_Programmieren.snowworld;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.text.StyleConstants.setBackground;

public class Snowworlddd extends BasicGame implements Snowworldddd {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SNOWFLAKES = 50;

    private Snowflake[] snowflakes;
    private Random random = new Random();

    public Snowworlddd() {
        super(String.valueOf(true));
        snowflakes = new Snowflake[NUM_SNOWFLAKES * 3];
        for (int i = 0; i < NUM_SNOWFLAKES; i++) {
            snowflakes[i] = new Snowflake(random.nextInt(WIDTH), random.nextInt(HEIGHT), 10, 5);
            snowflakes[i + NUM_SNOWFLAKES] = new Snowflake(random.nextInt(WIDTH), random.nextInt(HEIGHT), 5, 3);
            snowflakes[i + NUM_SNOWFLAKES * 2] = new Snowflake(random.nextInt(WIDTH), random.nextInt(HEIGHT), 2, 1);
        }
        Timer timer = new Timer(30, e -> update());
        timer.start();
    }

    private void update() {
        for (Snowflake s : snowflakes) {
            s.fall();
            if (s.y > HEIGHT) {
                s.y = 0;
                s.x = random.nextInt(WIDTH);
            }
        }
        repaint();
    }

    private void repaint() {
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        for (Snowflake s : snowflakes) {
            g.fillOval(s.x, s.y, s.size, s.size);
            setBackground(Color.BLACK);
        }
    }

    private void setBackground(Color black) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snowfall Simulation");
        Snowworlddd panel = new Snowworlddd();
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, org.newdawn.slick.Graphics graphics) throws SlickException {

    }

    private static class Snowflake {
        int x, y, size, speed;

        public Snowflake(int x, int y, int size, int speed) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.speed = speed;
        }

        public void fall() {
            y += speed;
        }
    }
}