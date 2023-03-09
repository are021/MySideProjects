import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DexFrame extends JFrame {
	
	DexFrame(){
		this.setTitle("My PokeDex");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,800);
		// This color is fire lowkey 120,50,255
		this.getContentPane().setBackground(new Color(179, 196, 196));
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("IMG_4624.jpg");
		this.setIconImage(image.getImage());
	}
	
	
}
