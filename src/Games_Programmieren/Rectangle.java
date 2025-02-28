package Games_Programmieren;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Rectangle extends JPanel implements KeyListener {
    private final int TILE_SIZE = 40;
    private final int ROWS = 10, COLS = 10;
    private int playerX = 1, playerY = 1;

    private final int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    public Rectangle() {
        JFrame frame = new JFrame("Labyrinth Game");
        frame.setSize(COLS * TILE_SIZE, ROWS * TILE_SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int y = 0; y < ROWS; y++) {
            for (int x = 0; x < COLS; x++) {
                if (maze[y][x] == 1) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.GREEN);
                }
                g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                g.setColor(Color.GRAY);
                g.drawRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
        g.setColor(Color.WHITE);
        g.fillOval(playerX * TILE_SIZE + 4, playerY * TILE_SIZE + 4, TILE_SIZE - 8, TILE_SIZE - 10);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int newX = playerX;
        int newY = playerY;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: newY--; break;
            case KeyEvent.VK_S: newY++; break;
            case KeyEvent.VK_A: newX--; break;
            case KeyEvent.VK_D: newX++; break;
        }
        if (maze[newY][newX] == 0) {
            playerX = newX;
            playerY = newY;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

}
