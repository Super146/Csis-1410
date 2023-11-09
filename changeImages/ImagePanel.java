package changeImages;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class ImagePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Color[] colors = {Color.ORANGE, Color.BLUE, Color.RED};
	private int colorIndex = 0;
	private int x = 50;
	/**
	 * Create the panel.
	 */
	public ImagePanel() {
			
		

	}
	
	/*
	 * change the background color
	 */
	
	public void changeColor() {
		colorIndex = ++colorIndex % colors.length;
		setBackground(colors[colorIndex]);
	}
	/*
	 * move car to the right
	 * 
	 */
	public void move() {
		x += 10;
		repaint();
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setBackground(colors[colorIndex]);
		ImageIcon icon = new ImageIcon(
		ImagePanel.class.getResource("/changeImages/images/suv.png"));
		
		icon.paintIcon(this, g, x, 50);
	}

}

