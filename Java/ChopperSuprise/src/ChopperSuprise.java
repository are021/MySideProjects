import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ChopperSuprise {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Suprise!!!");
	JPanel panel = new JPanel();
	ChopperSuprise(){
		//Image
		ImageIcon image = new ImageIcon("chopperEat.gif");
		//int width = 200;
	    //int height = 135;
	    //image.setImage(image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
	    Border border = BorderFactory.createLineBorder(Color.GRAY,10);
		
	    //Label
		label.setFont(new Font("Arial",Font.BOLD,25));
		label.setIcon(image);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setBorder(border);
		
		//Panel
		//panel.setPreferredSize(new Dimension(300,400));
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.GREEN);
		panel.add(label);
		
		//Move the Label Around
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		frame.setBackground(Color.GRAY);
		frame.add(panel,BorderLayout.CENTER);
		
		//frame.add(label);
		
		frame.setVisible(true);
	}
}
