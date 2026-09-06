package lab3.controller;

import lab3.Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class GameActionBarListener {
	
	public static ActionListener guessButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      Main.app.gameActionBar.textField.setText("");

      Main.app.gameActionBar.textField.setForeground(Color.GRAY);

      Main.app.gameActionBar.textField.setText("Enter a number...");
    }
  };

  public static ActionListener quitButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      Main.app.frame.getContentPane().add(Main.app.actionBar, BorderLayout.SOUTH);

      Main.app.frame.getContentPane().remove(Main.app.gameActionBar);

      Main.app.frame.setVisible(true);

      Main.app.gameRunning = false;
    }
  };

	public static FocusListener textFieldListener = new FocusListener() {
      
		public void focusGained(FocusEvent e) {

			Main.app.gameActionBar.textField.setForeground(Color.BLACK);

			Main.app.gameActionBar.textField.setText("");
		}

		public void focusLost(FocusEvent e) {

			if (!Main.app.gameActionBar.textField.getText().equals("")) { return; }

			Main.app.gameActionBar.textField.setForeground(Color.GRAY);

			Main.app.gameActionBar.textField.setText("Enter a number...");
		}
	};
}
