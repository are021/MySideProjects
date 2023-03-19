import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon neutral;
	ImageIcon sad;
	ImageIcon shock;
	ImageIcon smile;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		neutral = new ImageIcon("neutral.jpeg");
		sad = new ImageIcon("sad.jpg");
		shock = new ImageIcon("shock.jpeg");
		smile = new ImageIcon("smile.jpeg");
		
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(sad);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(neutral);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(shock);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setIcon(smile);
	}

}
