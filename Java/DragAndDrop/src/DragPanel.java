import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {

	ImageIcon image = new ImageIcon("gengar.png");
	final int width = image.getIconWidth();
	final int height = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	DragPanel(){
		imageCorner = new Point(0,0);
		ClickListener cL = new ClickListener();
		DragListener dL = new DragListener();
		
		this.addMouseListener(cL);
		this.addMouseMotionListener(dL);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //Readjust Image
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint(); //Update Previous Point
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner.translate( 
					(int)(currentPt.getX() - prevPt.getX()),
					(int)(currentPt.getY() - prevPt.getY())
					);
			prevPt = currentPt;
			repaint();
		}
	}
}
