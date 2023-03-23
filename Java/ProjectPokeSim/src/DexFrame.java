import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class DexFrame extends JFrame implements ActionListener {
	
	JLabel label;
	JComboBox box;
	JPanel selectionPanel;
	JPanel imagePanel;
	JPanel infoPanel;
	
	JLabel abilities;
	JLabel desc;
	JLabel types;
	JLabel id;
	
	
	ImageIcon pikachu = new ImageIcon("fixed.png");
	DexFrame(String[] pkmn){
		
		selectionPanel = new JPanel();
		selectionPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
		selectionPanel.setPreferredSize(new Dimension(250,100));
		label = new JLabel("Select a Pokemon");
		label.setFont(new Font("Arial",Font.BOLD,18));
		
		label.setIcon(pikachu);
		label.setIconTextGap(50);
		selectionPanel.add(label);
		box = new JComboBox(pkmn);
		box.addActionListener(this);
		selectionPanel.add(box);
		
		
		this.add(selectionPanel,BorderLayout.NORTH);
		
		///////Panel 2//////////
		JLabel label2 = new JLabel("IS THIS WORKING???");
		imagePanel = new JPanel();
		imagePanel.setBackground(Color.LIGHT_GRAY);
		imagePanel.setPreferredSize(new Dimension(250,250));
		imagePanel.add(label2);
		
		this.add(imagePanel,BorderLayout.CENTER);
		
		
		////////Panel3///////////
		infoPanel = new JPanel();
		infoPanel.setBackground(Color.gray);
		infoPanel.setPreferredSize(new Dimension(250,350));
		infoPanel.setLayout(new BorderLayout());		//Lets me adjust label locations
		
		id = new JLabel();
		id.setFont(new Font("Arial",Font.BOLD,30));
		
		infoPanel.add(id);
		this.add(infoPanel,BorderLayout.SOUTH);
		
		
		
		
		
		
		
		
		////////////////JFrame///////////////////////////
		
		this.setTitle("My PokeDex");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// This color is fire lowkey 120,50,255
		this.getContentPane().setBackground(new Color(179, 196, 196));
		this.setSize(800,1200);
		//this.setLayout();
		//this.pack();
		this.setVisible(true);

		ImageIcon image = new ImageIcon("IMG_4624.jpg");
		this.setIconImage(image.getImage());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == box) {
			System.out.println(box.getSelectedItem());
			id.setText("ID "+box.getSelectedItem());
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