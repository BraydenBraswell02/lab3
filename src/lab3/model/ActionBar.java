package lab3.model;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import lab3.controller.ActionBarListener;

public class ActionBar extends JPanel {

  public JComboBox<String> gameModeComboBox = new JComboBox<String>() {{

    addItem("Higher/Lower");
    addItem("Closer/Away");
  }};
  
  public JButton startGameButton = new JButton("start");

  public JButton exitGameButton  = new JButton("exit");

  public ActionBar() {

    setBorder(new TitledBorder("Actions"));

    setLayout(new GridLayout(1, 3));

    add(gameModeComboBox);
    add(startGameButton);
    add(exitGameButton);

    gameModeComboBox.addActionListener(ActionBarListener.gameModeComboBoxListener);
    startGameButton.addActionListener(ActionBarListener.startGameButtonListener);
    exitGameButton.addActionListener(ActionBarListener.exitGameButtonListener);
  }
}
