import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class DexFrame extends JFrame implements ActionListener {
	
	JLabel label;
	JComboBox box;
	DexFrame(String[] pkmn){
		
		
		box = new JComboBox(pkmn);
		box.addActionListener(this);
		this.add(box);
		this.setTitle("My PokeDex");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// This color is fire lowkey 120,50,255
		this.getContentPane().setBackground(new Color(179, 196, 196));
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);

		ImageIcon image = new ImageIcon("IMG_4624.jpg");
		this.setIconImage(image.getImage());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == box) {
			System.out.println(box.getSelectedItem());
		}
		
	}
	
	
}


//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//label = new JLabel();
//label.setBounds(0, 0, 1500, 500);
//label.setText("Select a Pokemon!");
//label.setBackground(Color.GRAY);
//label.setOpaque(true);
//setBounds(0,0,screenSize.width, screenSize.height);
//this.setSize(1500,800);

//this.add(label);