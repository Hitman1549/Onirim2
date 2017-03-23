import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JFrame
{
	public void makeEnvironment()
	{
		setTitle("Basic Drawing Tests");
		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel pan = new MyPanel();
		pan.setBackground(Color.BLACK);
		getContentPane().add(pan);
		setResizable(true);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			drawStuff(g);
		}
		
	}
	
	public void drawStuff(Graphics g)
	{
		int width = 100;
		int height = 100;
		
		int x = 0;
		int y = 0;
		// Drawing code here
		g.setColor(Color.WHITE);
		for(int i = 1; i < 60; i++)
		{
			g.drawLine(i*10, 0, i*10, 600);
		}
		for(int i = 1; i < 60; i++)
		{
			g.drawLine(0, i*10, 600, i*10);
		}
		g.drawOval(x, y, width, height);
		g.drawRect(x, y, width, height);
		g.setColor(Color.red);
		g.fillOval(x, y, width, height);
		g.drawOval(x, y, 4, 4);
		// For rectangles
		int[] xCords = {100, 200, 300, 400};
		int[] yCords = {0, 550, 120, -45, 100};
		g.drawPolygon(xCords, yCords, 3);
		g.setColor(Color.MAGENTA);
		g.fillPolygon(xCords, yCords, 3);
		repaint();
	}
	
	public static void main(String [] args)
	{
		Drawings obj = new Drawings();
		obj.makeEnvironment();
	}
}