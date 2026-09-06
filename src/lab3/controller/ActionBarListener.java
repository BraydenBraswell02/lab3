package lab3.controller;

import lab3.GameMode;
import lab3.Main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBarListener {

	public static ActionListener gameModeComboBoxListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      Main.app.gameMode = switch (Main.app.actionBar.gameModeComboBox.getSelectedIndex()) {

        case 0 -> GameMode.HIGHER_LOWER;

        case 1 -> GameMode.CLOSER_AWAY;

        default -> GameMode.UNKNOWN;
      };

      System.out.println(Main.app.gameMode);
    }
  };

  public static ActionListener startGameButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      Main.app.frame.getContentPane().add(Main.app.gameActionBar, BorderLayout.SOUTH);

      Main.app.frame.getContentPane().remove(Main.app.actionBar);

      Main.app.frame.requestFocus();

      Main.app.frame.setVisible(true);

      Main.app.gameRunning = true;
    }
  };

  public static ActionListener exitGameButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      System.exit(0);
    }
  };
}
