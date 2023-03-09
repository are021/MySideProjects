import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click for Suprise!");
	
	LaunchPage(){
		
		button.setBounds(150,250,200,100);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			frame.dispose();
			ChopperSuprise choppa = new ChopperSuprise();
		}
		
	}
}
