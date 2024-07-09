import javax.swing.*;
import java.awt.*;

public class Panel1 {
  public static void main(String[] args) {
    Panel1 panel = new Panel1();
	panel.go();
  }

  public void go() {
    JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
	JButton button = new JButton("shock me");
	JButton buttonTwo = new JButton("bliss");
	
	panel.add(button);
	panel.add(buttonTwo);
	
	panel.setBackground(Color.darkGray);
	frame.getContentPane().add(BorderLayout.EAST, panel);
	frame.setSize(200, 200);
	frame.setVisible(true);
  }
}  