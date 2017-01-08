package Program;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class Program extends JFrame {


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program frame = new Program();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Program() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Dimension windowSize = getSize();
          GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
          Point centerPoint = ge.getCenterPoint();

          int dx = centerPoint.x - windowSize.width / 2;
          int dy = centerPoint.y - windowSize.height / 2;    
          setLocation(dx-200, dy-200);
          
          
		setSize(800,400);
		setUndecorated(true);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		getContentPane().add(layeredPane, "name_1131198718260779");
	
	}
}
