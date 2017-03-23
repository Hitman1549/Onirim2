import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//import Drawings.MyPanel;

public class ImageTester extends JFrame
{
	private String fileName = "DatBoi.png";
	private BufferedImage myImage;
	
	public int myX = 0;
	public int myY = 0;
	public int mySpeed = 0;
	public double theta = 0;
	public boolean isMoving = true;
	public boolean isRotating = false;
	public boolean firstTime = true;
	public ImageTester()
	{
		try
		{
			myImage = ImageIO.read(new File(fileName));
		}
			catch(Exception e){System.out.println(e + "Damn it");
		}
	}
	
	public static void main(String[] args)
		{
			ImageTester obj = new ImageTester();
			obj.makeEnvironment();
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
		myY = 100;
		mySpeed = 3;
		Graphics2D newG = (Graphics2D)g;
		int mySize = 125;
		
		// Speed
		if(isMoving == true)
		{
			myX+=mySpeed;
		}
		//stop and rotate
		if(firstTime == true)
			if(myX > getWidth()/2)
			{
				isMoving = false;
				isRotating = true;
				firstTime = false;
			}
		
//		Rotation
		if(isMoving == false)
		{
			if(theta < 6)
			{
				newG.rotate(theta, myX+mySize/2, myY+mySize/2);
				theta += 0.05;
				System.out.println(theta + " ");		
			}
			else
				isMoving = true;
		}

		newG.drawImage(myImage, myX, myY, mySize, mySize, null);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e){
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		

			
		
		repaint();
	}
	
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
}
