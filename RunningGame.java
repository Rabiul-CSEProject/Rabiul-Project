import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RunningGame extends JPanel implements ActionListener {
    private int playerPosition = 0;
    private int obstaclePosition;
    private int score = 0;
    private boolean gameOver = false;
    private Timer timer;
    private Random random = new Random();

    public RunningGame() {
        setPreferredSize(new Dimension(800, 400));
        setBackground(Color.WHITE);
        timer = new Timer(100, this);
        timer.start();
        obstaclePosition = random.nextInt(800) + 200;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!gameOver) {
            g.setColor(Color.RED);
            g.fillRect(playerPosition, 350, 50, 50); // Draw player
            g.setColor(Color.BLUE);
            g.fillRect(obstaclePosition, 350, 50, 50); // Draw obstacle
            g.setColor(Color.BLACK);
            g.drawString("Score: " + score, 10, 10); // Draw score
        } else {
            g.setColor(Color.BLACK);
            g.drawString("Game Over! Final Score: " + score, 350, 200);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            playerPosition += 5;
            if (playerPosition >= obstaclePosition) {
                gameOver = true;
            } else {
                score++;
                if (playerPosition % 200 == 0) {
                    obstaclePosition = playerPosition + random.nextInt(400) + 200;
                }
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Running Game");
        RunningGame game = new RunningGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
