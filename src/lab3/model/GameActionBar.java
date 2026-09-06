package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GameActionBar extends JPanel {

  public ActionListener guessButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      textField.setText("");

      textField.setForeground(Color.GRAY);

      textField.setText("Enter a number...");
    }
  };

  public ActionListener quitButtonListener = new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {

      Main.app.frame.getContentPane().add(Main.app.actionBar, BorderLayout.SOUTH);

      Main.app.frame.getContentPane().remove(Main.app.gameActionBar);

      Main.app.frame.setVisible(true);

      Main.app.gameRunning = false;
    }
  };

  public JTextField textField = new JTextField() {{

    addFocusListener(new FocusListener() {
      
      public void focusGained(FocusEvent e) {

        setForeground(Color.BLACK);

        setText("");
      }

      public void focusLost(FocusEvent e) {

        if (!getText().equals("")) { return; }

        setForeground(Color.GRAY);

        setText("Enter a number...");
      }
    });
  }};
  
  public JButton guessButton = new JButton() {{

    setText("guess");

    addActionListener(guessButtonListener);
  }};

  public JButton quitButton  = new JButton() {{

    setText("quit");

    addActionListener(quitButtonListener);
  }};

  public GameActionBar() {

    setBorder(new TitledBorder("Actions"));

    setLayout(new GridLayout(1, 3));

    add(textField);
    add(guessButton);
    add(quitButton);
  }
}
