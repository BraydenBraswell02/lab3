package lab3.model;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import lab3.controller.GameActionBarListener;

public class GameActionBar extends JPanel {

  public JTextField textField = new JTextField();
  
  public JButton guessButton = new JButton("guess");

  public JButton quitButton  = new JButton("quit");

  public GameActionBar() {

    setBorder(new TitledBorder("Actions"));

    setLayout(new GridLayout(1, 3));

    add(textField);
    add(guessButton);
    add(quitButton);

    textField.addFocusListener(GameActionBarListener.textFieldListener);
    guessButton.addActionListener(GameActionBarListener.guessButtonListener);
    quitButton.addActionListener(GameActionBarListener.quitButtonListener);
  }
}
