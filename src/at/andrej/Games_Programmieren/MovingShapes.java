package at.andrej.Games_Programmieren;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

    class MovingShape {
        int x, y, speed;
        int width, height;
        Color color;

        public MovingShape(int x, int y, int width, int height, int speed, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.speed = speed;
            this.color = color;
        }

        public void move() {
            x += speed;
        }
    }

    class RectangleShape extends MovingShape {
        private boolean movingRight;

        public RectangleShape(int x, int y, int width, int height, int speed, Color color, boolean movingRight) {
            super(x, y, width, height, movingRight ? speed : -speed, color);
            this.movingRight = movingRight;
        }
    }

    class CircleShape extends MovingShape {
        public CircleShape(int x, int y, int diameter, int speed, Color color) {
            super(x, y, diameter, diameter, speed, color);
        }

        @Override
        public void move() {
            super.move();
            width += 1; // Diameter wächst
            height += 1;
        }
    }

    class EclipseShape extends MovingShape {
        private boolean flyingIn;

        public EclipseShape(int x, int y, int width, int height, int speed, Color color) {
            super(x, y, width, height, speed, color);
            this.flyingIn = true;
        }

        @Override
        public void move() {
            if (flyingIn) {
                x += speed;
                if (x > 100) flyingIn = false; // Sobald eine Schwelle erreicht ist, hört es auf
            }
        }
    }

    class AnimationPanel extends JPanel {
        private final ArrayList<MovingShape> shapes = new ArrayList<>();
        private final Random rand = new Random();

        public AnimationPanel() {
            setPreferredSize(new Dimension(800, 600));
            setBackground(Color.BLACK);

            for (int i = 0; i < 10; i++) {
                shapes.add(new RectangleShape(rand.nextInt(800), rand.nextInt(600), 50, 30, 2, Color.RED, rand.nextBoolean()));
                shapes.add(new CircleShape(rand.nextInt(800), rand.nextInt(600), 30, 2, Color.BLUE));
                shapes.add(new EclipseShape(-50, rand.nextInt(600), 60, 40, 3, Color.GREEN));
            }
            Timer timer = new Timer(30, e -> updateAnimation());
            timer.start();
        }

        private void updateAnimation() {
            for (MovingShape shape : shapes) {
                shape.move();
            }
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (MovingShape shape : shapes) {
                g.setColor(shape.color);
                if (shape instanceof CircleShape) {
                    g.fillOval(shape.x, shape.y, shape.width, shape.height);
                } else if (shape instanceof EclipseShape) {
                    g.fillOval(shape.x, shape.y, shape.width, shape.height);
                } else {
                    g.fillRect(shape.x, shape.y, shape.width, shape.height);
                }
            }
        }
    }

    class AnimationApp {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Animation Demo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new AnimationPanel());
                frame.pack();
                frame.setVisible(true);
            });
        }
    }

