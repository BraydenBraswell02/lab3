package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class App implements Runnable {

  public final int frameWidth  = 500;
  public final int frameHeight = 300;

  public Random random = new Random();

  public int rNum = random.nextInt();

  public JFrame frame = new JFrame();

  public JPanel renderPanel = new JPanel() {

    public void paintComponent(Graphics g) {

      Graphics2D g2d = (Graphics2D) g;

      g2d.setColor(Color.WHITE);

      g2d.fillRect(0, 0, getWidth(), getHeight());

      g2d.setColor(Color.BLACK);

      g2d.drawString(rNum + "", 250, 150);
    } 
  };
  
  public void init() {

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    frame.setPreferredSize(new Dimension(500, 300));

    frame.setLocationRelativeTo(null);

    frame.setLocation(frame.getX() - frameWidth / 2, frame.getY() - frameHeight / 2);

    frame.getContentPane().add(renderPanel, BorderLayout.CENTER);
    frame.getContentPane().add(new ActionBar(), BorderLayout.SOUTH);

    frame.pack();

    frame.setVisible(true);
  }

  public void run() {

    while (true) {

      try { Thread.sleep(1); } catch (Exception e) {}

      frame.repaint();
    }
  }
}
