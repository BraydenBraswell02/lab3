package lab3.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import lab3.model.ActionBar;
import lab3.model.GameActionBar;
import lab3.model.GameMode;

public class App implements Runnable {

  public final int frameWidth  = 500;
  public final int frameHeight = 300;

  public final int minNum = 1;
  public final int maxNum = 100;

  public GameMode gameMode = GameMode.HIGHER_LOWER;

  public boolean gameRunning = false;

  public Random random = new Random();

  public int rNum = random.nextInt();

  public ActionBar actionBar = new ActionBar();

  public GameActionBar gameActionBar = new GameActionBar();

  public JFrame frame = new JFrame();

  public JPanel renderPanel = new JPanel() {

    public void paintComponent(Graphics g) {

      Graphics2D g2d = (Graphics2D) g;

      g2d.setColor(Color.WHITE);

      g2d.fillRect(0, 0, getWidth(), getHeight());

      if (!gameRunning) { return; }

      g2d.setColor(Color.BLACK);

      g2d.drawString("I am thinking of a number between " + minNum + " and " + maxNum, 15, 30);
    } 
  };
  
  public void init() {

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    frame.setPreferredSize(new Dimension(500, 300));

    frame.setLocationRelativeTo(null);

    frame.setLocation(frame.getX() - frameWidth / 2, frame.getY() - frameHeight / 2);

    frame.getContentPane().add(renderPanel, BorderLayout.CENTER);
    frame.getContentPane().add(actionBar, BorderLayout.SOUTH);

    frame.pack();

    frame.setVisible(true);

    frame.requestFocus();
  }

  public void run() {

    while (true) {

      try { Thread.sleep(1); } catch (Exception e) {}

      frame.repaint();
    }
  }
}
