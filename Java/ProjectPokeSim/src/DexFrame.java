import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;


public class DexFrame extends JFrame implements ActionListener {
	
	JLabel label;
	JComboBox box;
	JPanel selectionPanel;
	JPanel imagePanel;
	JPanel infoPanel;
	
	JLabel abilities;
	JTextArea desc;
	JLabel types;
	JLabel id;
	
	HashMap<String, String[]> dexEntries;
	
	
	ImageIcon pikachu = new ImageIcon("fixed.png");
	DexFrame(String[] pkmn, HashMap<String, String[]> dex){
		
		dexEntries = dex;
		
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
		infoPanel.setLayout(new GridBagLayout());		//Lets me adjust label locations
		
		
		////////////////GridPanelDesign////////////////////
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1.0; // make columns have equal width
		JPanel top = new JPanel();
		top.setBackground(Color.red);
		top.setLayout(new BorderLayout());
		JPanel midleft = new JPanel();
		midleft.setBackground(Color.LIGHT_GRAY);
		midleft.setLayout(new BorderLayout());
		JPanel midright = new JPanel();
		midright.setBackground(Color.LIGHT_GRAY);
		midright.setLayout(new BorderLayout());
		
		JPanel bottom = new JPanel();
		bottom.setLayout(null);
		bottom.setBackground(Color.white);
		// add top panel
		c.fill = GridBagConstraints.BOTH; // make components fill their cells
		c.weightx = 1;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2; // span 2 columns
		c.gridheight = 1; // span 1 row
		infoPanel.add(top, c);

		// add midleft panel
		c.fill = GridBagConstraints.BOTH; // make components fill their cells
		c.weightx = 1;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1; // span 1 column
		c.gridheight = 1; // span 1 row
		infoPanel.add(midleft, c);

		// add midright panel
		c.fill = GridBagConstraints.BOTH; // make components fill their cells
		c.weightx = 1;
		c.weighty = 1;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1; // span 1 column
		c.gridheight = 1; // span 1 row
		infoPanel.add(midright, c);

		// add bottom panel
		c.fill = GridBagConstraints.BOTH; // make components fill their cells
		c.weightx = 1;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2; // span 2 columns
		c.gridheight = 1; // span 1 row
		infoPanel.add(bottom, c);
		
		///////////////Description///////////////////////
		id = new JLabel("ID 0x000");
		id.setFont(new Font("Arial",Font.BOLD,30));
		id.setHorizontalAlignment(JLabel.CENTER);
		id.setVerticalAlignment(JLabel.CENTER);
		top.add(id);
		
		abilities = new JLabel("testingabilities");
		abilities.setHorizontalAlignment(JLabel.CENTER);
		abilities.setVerticalAlignment(JLabel.CENTER);
		midleft.add(abilities);	
		
		//
		desc= new JTextArea("Description");
		desc.setFont(new Font("Arial",Font.ITALIC,18));
		//desc.setPreferredSize(new Dimension(450,100));
		desc.setWrapStyleWord(true);
		desc.setBackground(Color.white);
		desc.setLineWrap(true);
		desc.setBounds(150, 20, 500, 100);
		bottom.add(desc);
		
		types = new JLabel("testing");
		types.setHorizontalAlignment(JLabel.CENTER);
		types.setVerticalAlignment(JLabel.CENTER);
	
		midright.add(types);
		
		this.add(infoPanel,BorderLayout.SOUTH);
		
		
		
		
		////////////////JFrame///////////////////////////
		
		this.setTitle("My PokeDex");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// This color is fire lowkey 120,50,255
		this.getContentPane().setBackground(new Color(179, 196, 196));
		this.setSize(800,1200);
		//this.setLayout();
		//this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		ImageIcon image = new ImageIcon("IMG_4624.jpg");
		this.setIconImage(image.getImage());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == box) {
			//System.out.println(Arrays.toString(dexEntries.get(box.getSelectedItem())));
			id.setText("ID #"+ getArray(box.getSelectedItem())[4]+": "+box.getSelectedItem());
			desc.setText(getArray(box.getSelectedItem())[1]);
			types.setText((getArray(box.getSelectedItem())[2]) + " "+(getArray(box.getSelectedItem())[3]));
			abilities.setText((getArray(box.getSelectedItem())[0]));
		}
		
	}
	public String[] getArray(Object object) {
		return dexEntries.get(object);
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