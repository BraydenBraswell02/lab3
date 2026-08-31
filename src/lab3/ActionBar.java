package lab3;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ActionBar extends JPanel {

  public ActionListener gameModeComboBoxListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

    }
  };

  public ActionListener startGameButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

    }
  };

  public ActionListener exitGameButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      System.exit(0);
    }
  };

  public JComboBox<String> gameModeComboBox = new JComboBox<String>() {{

    addItem("Higher/Lower");
    addItem("Closer/Away");

    addActionListener(gameModeComboBoxListener);
  }};
  
  public JButton startGameButton = new JButton() {{

    setText("start");

    addActionListener(startGameButtonListener);
  }};

  public JButton exitGameButton  = new JButton() {{

    setText("exit");

    addActionListener(exitGameButtonListener);
  }};

  public ActionBar() {

    setBorder(new TitledBorder("Actions"));

    setLayout(new GridLayout(1, 3));

    add(gameModeComboBox);
    add(startGameButton);
    add(exitGameButton);
  }
}
