import javax.swing.*;
import java.awt.*;


public class MyDrawPanel1 extends JPanel {
	private JButton button;
  public static void main(String[] args) {
  
    MyDrawPanel1 gui = new MyDrawPanel1();
	gui.go();
  }

  public void go() {
  
	JFrame frame = new JFrame();
	
	frame.getContentPane().add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	frame.setVisible(true);
  }
   

  public void paintComponent(Graphics g) {
  
    g.setColor(Color.orange);
	
	g.fillRect(20, 50, 100, 100);
  }	
}