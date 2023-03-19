import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	DragPanel gengar = new DragPanel();
	
	MyFrame(){
		this.add(gengar);
		this.setTitle("Gengar");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
