import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Card extends JFrame
{
	public static int HandCard = 0;
	public static int ProphNumber = 0;
	public static int DeckSize = 76;
	public static ArrayList<Integer> CardsN = new ArrayList<Integer>();
	public static ArrayList<Integer> Deck = new ArrayList<Integer>();
	public static ArrayList<Integer> Hand = new ArrayList<Integer>();
	public static ArrayList<Integer> Stack = new ArrayList<Integer>();
	public static ArrayList<Integer> doubleStack = new ArrayList<Integer>();
	public static ArrayList<Integer> Limbo = new ArrayList<Integer>();
	public static ArrayList<Integer> Discard = new ArrayList<Integer>();
	public static ArrayList<Integer> Doors = new ArrayList<Integer>();
	public static ArrayList<Integer> Inception = new ArrayList<Integer>();
	public static ArrayList<Integer> Prophacy = new ArrayList<Integer>();
	
	public static boolean repeat = false;
	public boolean card, cardO, cardT, cardTh, cardF;
	private boolean cardSelected = false;
	private boolean cardOneSelected = false;
	private boolean cardTwoSelected = false;
	private boolean cardThreeSelected = false;
	private boolean cardFourSelected = false;
	public boolean Nightmare = false;
	public boolean DoorsOrNO = false;
	public boolean TanDoor = false;
	public boolean BlueDoor = false;
	public boolean GreenDoor = false;
	public boolean RedDoor = false;
	private String TD = "TanDoor.png";
	private String RD = "RedDoor.png";
	private String BD = "BlueDoor.png";
	private String GD = "GreenDoor.png";
	private String TK = "TanKey.png";
	private String TM = "TanMoon.png";
	private String TS = "TanSun.png";
	private String RK = "RedKey.png";
	private String RM = "RedMoon.png";
	private String RS = "RedSun.png";
	private String BK = "BlueKey.png";
	private String BM = "BlueMoon.png";
	private String BS = "BlueSun.png";
	private String GK = "GreenKey.png";
	private String GM = "GreenMoon.png";
	private String GS = "GreenSun.png";
	private String NS = "NightmearS.png";
	private String CB = "CardBack.png";
	private String FA = "";
	private String FB = "";
	private String SA = "";
	private String SB = "";
	private String TA = "";
	private String TB = "";
	private BufferedImage ImageTD;
	private BufferedImage ImageRD;
	private BufferedImage ImageBD;
	private BufferedImage ImageGD;
	private BufferedImage ImageTK;
	private BufferedImage ImageTM;
	private BufferedImage ImageTS;
	private BufferedImage ImageBK;
	private BufferedImage ImageBM;
	private BufferedImage ImageBS;
	private BufferedImage ImageGK;
	private BufferedImage ImageGM;
	private BufferedImage ImageGS;
	private BufferedImage ImageRK;
	private BufferedImage ImageRM;
	private BufferedImage ImageRS;
	private BufferedImage ImageCB;
	private BufferedImage ImageNS;
	private int boardWidth = 1500;
	private int boardHeight = 800;
	private int cardWidth = 50, cardHeight = 100;
	boolean inc = false;
	public int RX = 0;
	public int RY = 0;
	public int AXpoint = RX + cardWidth/2;
	public int AYpoint = RY + cardHeight/2;
	public int stackPoint = cardHeight + 12;
	public int CBX = 1;
	public int CBY =  boardHeight - (cardHeight + 40);	
	public static Random randy = new Random();
	public String CardNow = "";		
	public int handHeight = boardHeight - (cardHeight + 50);
	public int cardSpace = cardWidth + 5;
	public int handSize = 0;
	public int stackCounter = 0;
	public boolean firstDraw = true;
	public boolean incept = false;
	public int deckX = 1;
	public int deckY = boardHeight - (cardHeight + 40);
	public int firstX = cardSpace*1;
	public int secondX = cardSpace*2;
	public int thirdX = cardSpace*3;
	public int fourthX = cardSpace*4;
	public int fifthX = cardSpace*5;
	public int handX0 = cardSpace;
	public int handX1 = cardSpace*2;
	public int handX2 = cardSpace*3;
	public int handX3 = cardSpace*4;
	public int handX4 = cardSpace*5;
	public int limboY = deckY - cardHeight - 10;
	public boolean HALT = false;
	public int firstY = deckY;
	public int secondY = deckY;
	public int thirdY = deckY;
	public int fourthY = deckY;
	public int fifthY = deckY;
	public int bottomLineYcoord = boardHeight - (cardHeight + 50);
	public boolean Ip = false;
	public boolean IIp = false;
	public boolean IIIp = false;
	public boolean IVp = false;
	public boolean Vp = false;
	public int Ps = 0;
	
	public int IX = cardSpace*1;
	public int IIX = cardSpace*2;
	public int IIIX = cardSpace*3;
	public int IVX = cardSpace*4;
	public int VX = cardSpace*5;
	
	public int IY = limboY;
	public int IIY = limboY;
	public int IIIY = limboY;
	public int IVY = limboY;
	public int VY = limboY;
	
	public Card()
	{
		if(TanDoor == true || BlueDoor == true || RedDoor == true || GreenDoor == true)
		{
			DoorsOrNO = true;
		}
		makeEnvironment();
		
		try
		{
			ImageTK = ImageIO.read(new File(TK));
		}
			catch(Exception e){System.out.println(e + "Damn it TK");
		}
		try
		{
			ImageTM = ImageIO.read(new File(TM));
		}
			catch(Exception e){System.out.println(e + "Damn it TM");
		}
		try
		{
			ImageTS = ImageIO.read(new File(TS));
		}
			catch(Exception e){System.out.println(e + "Damn it TS");
		}
		
		
		try
		{
			ImageGK = ImageIO.read(new File(GK));
		}
			catch(Exception e){System.out.println(e + "Damn it GK");
		}
		try
		{
			ImageGM = ImageIO.read(new File(GM));
		}
			catch(Exception e){System.out.println(e + "Damn it GM");
		}
		try
		{
			ImageGS = ImageIO.read(new File(GS));
		}
			catch(Exception e){System.out.println(e + "Damn it GS");
		}
		
		
		
		try
		{
			ImageBK = ImageIO.read(new File(BK));
		}
			catch(Exception e){System.out.println(e + "Damn it BK");
		}
		try
		{
			ImageBM = ImageIO.read(new File(BM));
		}
			catch(Exception e){System.out.println(e + "Damn it BM");
		}
		try
		{
			ImageBS = ImageIO.read(new File(BS));
		}
			catch(Exception e){System.out.println(e + "Damn it BS");
		}
		
		
		
		try
		{
			ImageRK = ImageIO.read(new File(RK));
		}
			catch(Exception e){System.out.println(e + "Damn it RK");
		}
		try
		{
			ImageRM = ImageIO.read(new File(RM));
		}
			catch(Exception e){System.out.println(e + "Damn it RM");
		}
		try
		{
			ImageRS = ImageIO.read(new File(RS));
		}
			catch(Exception e){System.out.println(e + "Damn it RS");
		}
		try
		{
			ImageCB = ImageIO.read(new File(CB));
		}
			catch(Exception e){System.out.println(e + "Damn it CB");
		}
		
		
		try
		{
			ImageNS= ImageIO.read(new File(NS));
		}
			catch(Exception e){System.out.println(e + "Damn it NS");
		}
		
		try
		{
			ImageTD= ImageIO.read(new File(TD));
		}
			catch(Exception e){System.out.println(e + "Damn it TD");
		}
		try
		{
			ImageRD= ImageIO.read(new File(RD));
		}
			catch(Exception e){System.out.println(e + "Damn it RD");
		}
		try
		{
			ImageBD= ImageIO.read(new File(BD));
		}
			catch(Exception e){System.out.println(e + "Damn it BD");
		}
		try
		{
			ImageGD= ImageIO.read(new File(GD));
		}
			catch(Exception e){System.out.println(e + "Damn it GD");
		}
	}
	public void drawTk(Graphics g, int X, int Y)
	{
		g.drawImage(ImageTK, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawTs(Graphics g, int X, int Y)
	{
		g.drawImage(ImageTS, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawTm(Graphics g, int X, int Y)
	{
		g.drawImage(ImageTM, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	
	public void drawBk(Graphics g, int X, int Y)
	{
		g.drawImage(ImageBK, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawBs(Graphics g, int X, int Y)
	{
		g.drawImage(ImageBS, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawBm(Graphics g, int X, int Y)
	{
		g.drawImage(ImageBM, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	
	public void drawGk(Graphics g, int X, int Y)
	{
		g.drawImage(ImageGK, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawGs(Graphics g, int X, int Y)
	{
		g.drawImage(ImageGS, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawGm(Graphics g, int X, int Y)
	{
		g.drawImage(ImageGM, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	
	public void drawRk(Graphics g, int X, int Y)
	{
		g.drawImage(ImageRK, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawRs(Graphics g, int X, int Y)
	{
		g.drawImage(ImageRS, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	public void drawRm(Graphics g, int X, int Y)
	{
		g.drawImage(ImageRM, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	
	public void drawNs(Graphics g, int X, int Y)
	{
		g.drawImage(ImageNS, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	
	public void drawCB(Graphics g, int X, int Y)
	{
		g.drawImage(ImageCB, X, Y, cardWidth, cardHeight, null);
	}
	
	public void drawTD(Graphics g, int X, int Y)
	{
		g.drawImage(ImageTD, X, Y, cardWidth, cardHeight, null);
	}
	public void drawRD(Graphics g, int X, int Y)
	{
		g.drawImage(ImageRD, X, Y, cardWidth, cardHeight, null);
	}
	public void drawBD(Graphics g, int X, int Y)
	{
		g.drawImage(ImageBD, X, Y, cardWidth, cardHeight, null);
	}
	public void drawGD(Graphics g, int X, int Y)
	{
		g.drawImage(ImageGD, X, Y, cardWidth, cardHeight, null);
	}
	
	public void makeEnvironment()
	{
		setTitle("Basic Drawing Tests");
		setBounds(0, 10, boardWidth, boardHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel pan = new MyPanel();
		pan.setBackground(Color.BLACK);
		addMouseListener(new Mousey());
		addMouseMotionListener(new Mousey());
		getContentPane().add(pan);
		setResizable(true);
		setVisible(true);
	}
	

	public static void main(String [] args)
	{
		for(int i = 0; i < DeckSize; i++)
			CardsN.add(new Integer(i));
		for(int i = 0; i < DeckSize; i++)
			Deck.add(CardsN.remove(randy.nextInt(CardsN.size())));
		Card obj = new Card();
	}
	public void DrawCard()
	{
		if(Hand.size() > 3)
			if(Hand.get(3) > 68 && Hand.get(3) <= 76)
			{
				Deck.add(randy.nextInt(Deck.size()), Hand.remove(3));
			}
		if(Prophacy.size() > 0 && Prophacy.size() < 5 && Hand.size() < 5)
		{
			Hand.add(Prophacy.remove(0));
			if(58 < Hand.get(Hand.size() - 1) && Hand.get(Hand.size() - 1) < 68)
			{
				Nightmare = true;
				System.out.println("Nightmare is in play");
			}
		}
		else
		if(Hand.size() < 5 && Prophacy.size() == 0)
		{
			
			if(firstDraw == true)
				if(Deck.get(0) > 58)
				{
					Limbo.add(Limbo.size(), Deck.remove(0));
					System.out.println("The Limbo is "+Limbo.size() + " Cards Big");
				}
				else
					Hand.add(Hand.size(), Deck.remove(0));
				
				if(firstDraw == true && Hand.size() >= 5)
				{	
					while(Limbo.size() != 0)
					{
						Deck.add(randy.nextInt(Deck.size()), Limbo.remove(0));
						
					}
					firstDraw = false;
				}
				if(firstDraw == false && Hand.size() < 5)
				{
					Hand.add(Hand.size(), Deck.remove(0));				
					if(58 < Hand.get(4) && Hand.get(4) < 68)
					{
						Nightmare = true;
						System.out.println("Nightmare is in play");
					}
					if(68 < Hand.get(4) && Hand.get(4) <= 70)
					{
						TanDoor = true;System.out.println("Tan Door");
					}
					if(70 < Hand.get(4) && Hand.get(4) <= 72)
					{
						BlueDoor = true;System.out.println("Blue Door");
					}
					if(72 < Hand.get(4) && Hand.get(4) <= 74)
					{
						GreenDoor = true;System.out.println("Green Door");
					}
					if(74 < Hand.get(4) && Hand.get(4) <= 76)
					{
						RedDoor = true;System.out.println("Red Door");
					}
				}

		}

	}
	public void putDownCards(int a, Graphics g, int x, int y)
	{
		if(a <= 9)// 1,2,3,4,5,6,7,8,9
		{
			drawTk(g, x, y);
		}
		else if(a <= 17)//10,11,12,13,14,15,16,17
		{
			drawTs(g, x, y);
		}
		else if(a <= 24)//18,19,20,21,22,23,24
		{
			drawTm(g, x, y);
		}
		else if(a <= 30)//25,26,27,28,29,30
		{
			drawBk(g, x, y);
		}
		else if(a <= 34)//31,32,33,34
		{
			drawBs(g, x, y);
		}
		else if(a <= 38)//35,36,37,38
		{
			drawBm(g, x, y);
		}
		else if(a <= 42)//39,40,41,42
		{
			drawGk(g, x, y);
		}
		else if(a <= 46)//43,44,45,46
		{
			drawGs(g, x, y);
		}
		else if(a <= 49)//47,48,49
		{
			drawGm(g, x, y);
		}
		else if(a <= 52)//50,51,52
		{
			drawRk(g, x, y);
		}
		else if(a <= 55)//53,54,55
		{
			drawRs(g, x, y);
		}
		else if(a <= 58)//56,57,58
		{
			drawRm(g, x, y);
		}
		else if(a <= 68)//59,60,61,62,63,64,65,66,67,68
		{
			drawNs(g, x, y);
		}
		else if(a <= 70)//69,70
		{
			drawTD(g, x, y);
		}
		else if(a <= 72)//71,72
		{
			drawBD(g, x, y);
		}
		else if(a <= 74)//73,74
		{
			drawGD(g, x, y);
		}
		else if(a <= 76)//75,76
		{
			drawRD(g, x, y);
		}
	}

	public void drawBoard(Graphics g)
	{		
		g.setColor(Color.WHITE);
		g.drawLine(cardWidth + 5, cardHeight + 5, boardWidth, cardHeight + 5);
		g.setColor(Color.BLUE);
		g.drawLine(cardWidth + 5, 0, cardWidth + 5, boardHeight + 5);
		g.setColor(Color.GREEN);
		g.drawLine(0, boardHeight - (cardHeight + 50), boardWidth, bottomLineYcoord);
		g.setColor(Color.RED);
		drawCB(g, 1, boardHeight - (cardHeight + 40));
		g.setColor(Color.orange);
		g.fillRect(0, 0, cardWidth + 5, deckY - 10);
		repaint();

	}
	public void drawCards(Graphics g)
	{
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		if(Hand.size() > 0)
		{
			int first = Hand.get(0);
			putDownCards(first, g, firstX, firstY);
		}
		if(Hand.size() > 1)
		{
			int second = Hand.get(1);
			putDownCards(second, g, secondX, secondY);
		}
		if(Hand.size() > 2)
		{
			int third = Hand.get(2);
			putDownCards(third, g, thirdX, thirdY);
		}
		if(Hand.size() > 3)
		{
			int fourth = Hand.get(3);
			putDownCards(fourth, g, fourthX, fourthY);
		}
		if(Hand.size() > 4)
		{
			int fifth = Hand.get(4);
			putDownCards(fifth, g, fifthX, fifthY);
		}
		for(stackCounter = 0; stackCounter < Stack.size(); stackCounter++)
		{
			putDownCards(Stack.get(stackCounter), g, (cardWidth*2)+(15*stackCounter), stackPoint);
		}
		
		for(int i = 0; i < Limbo.size(); i++)
		{
			putDownCards(Limbo.get(i), g, cardWidth + (cardWidth+5)*i, limboY);
		}
		
		if(Prophacy.size() > 0)
		{
			int first = Prophacy.get(0);
			putDownCards(first, g, IX, IY);
		}
		if(Prophacy.size() > 1)
		{
			int second = Prophacy.get(1);
			putDownCards(second, g, IIX, IIY);
		}
		if(Prophacy.size() > 2)
		{
			int third = Prophacy.get(2);
			putDownCards(third, g, IIIX, IIIY);
		}
		if(Prophacy.size() > 3)
		{
			int fourth = Prophacy.get(3);
			putDownCards(fourth, g, IVX, IVY);
		}
		if(Prophacy.size() > 4)
		{
			int fifth = Prophacy.get(4);
			putDownCards(fifth, g, VX, VY);
		}
		for(int doors = 0; doors < Doors.size(); doors++)
		{
			putDownCards(Doors.get(doors), g, cardWidth + (cardWidth+1)*doors, 5);
		}

			
		repaint();
	}

		public class MyPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			drawCards(g);
			drawBoard(g);
		}
	}

	private class Mousey implements MouseListener, MouseMotionListener
	{
		public void prophit()
		{
			// TODO
			while(Prophacy.size() < 5)
				Prophacy.add(Prophacy.size(), Deck.remove(0));

		}
		
		@Override
		public void mouseDragged(MouseEvent arg0) 
		{
			System.out.println("mouseDragged");
			if(cardSelected == true)
			{
				firstX = arg0.getX() - cardWidth/2;
				firstY = arg0.getY() - cardHeight/2;
				if(firstX > secondX - cardWidth/2 && firstY >= deckY)
				{secondX = handX0;}
				if(firstX < secondX + cardWidth/2 && firstY >= deckY)
				{secondX = handX1;}
				if(firstX > thirdX - cardWidth/2 && firstY >= deckY)
				{thirdX = handX1;}
				if(firstX < thirdX + cardWidth/2 && firstY >= deckY)
				{thirdX = handX2;}
				if(firstX > fourthX - cardWidth/2 && firstY >= deckY)
				{fourthX = handX2;}
				if(firstX < fourthX + cardWidth/2 && firstY >= deckY)
				{fourthX = handX3;}
				if(firstX > fifthX - cardWidth/2 && firstY >= deckY)
				{fifthX = handX3;}
				if(firstX < fifthX + cardWidth/2 && firstY >= deckY)
				{fifthX = handX4;}
			}
			if(cardOneSelected == true)
			{
				secondX = arg0.getX() - cardWidth/2;
				secondY = arg0.getY() - cardHeight/2;
				if(secondX > firstX - cardWidth/2 && secondY >= deckY)
				{firstX = handX0;}
				if(secondX < firstX + cardWidth/2 && secondY >= deckY)
				{firstX = handX1;}
				if(secondX > thirdX - cardWidth/2 && secondY >= deckY)
				{thirdX = handX1;}
				if(secondX < thirdX + cardWidth/2 && secondY >= deckY)
				{thirdX = handX2;}
				if(secondX > fourthX - cardWidth/2 && secondY >= deckY)
				{fourthX = handX2;}
				if(secondX < fourthX + cardWidth/2 && secondY >= deckY)
				{fourthX = handX3;}
				if(secondX > fifthX - cardWidth/2 && secondY >= deckY)
				{fifthX = handX3;}
				if(secondX < fifthX + cardWidth/2 && secondY >= deckY)
				{fifthX = handX4;}
			}
			if(cardTwoSelected == true)
			{
				thirdX = arg0.getX() - cardWidth/2;
				thirdY = arg0.getY() - cardHeight/2;
				if(thirdX > firstX - cardWidth/2 && thirdY >= deckY)
				{firstX = handX0;}
				if(thirdX < firstX + cardWidth/2 && thirdY >= deckY)
				{firstX = handX1;}
				if(thirdX > secondX - cardWidth/2 && thirdY >= deckY)
				{secondX = handX1;}
				if(thirdX < secondX + cardWidth/2 && thirdY >= deckY)
				{secondX = handX2;}
				if(thirdX > fourthX - cardWidth/2 && thirdY >= deckY)
				{fourthX = handX2;}
				if(thirdX < fourthX + cardWidth/2 && thirdY >= deckY)
				{fourthX = handX3;}
				if(thirdX > fifthX - cardWidth/2 && thirdY >= deckY)
				{fifthX = handX3;}
				if(thirdX < fifthX + cardWidth/2 && thirdY >= deckY)
				{fifthX = handX4;}
			}
			if(cardThreeSelected == true)
			{
				fourthX = arg0.getX() - cardWidth/2;
				fourthY = arg0.getY() - cardHeight/2;
				if(fourthX > firstX - cardWidth/2 && fourthY >= deckY)
				{firstX = handX0;}
				if(fourthX < firstX + cardWidth/2 && fourthY >= deckY)
				{firstX = handX1;}
				if(fourthX > secondX - cardWidth/2 && fourthY >= deckY)
				{secondX = handX1;}
				if(fourthX < secondX + cardWidth/2 && fourthY >= deckY)
				{secondX = handX2;}
				if(fourthX > thirdX - cardWidth/2 && fourthY >= deckY)
				{thirdX = handX2;}
				if(fourthX < thirdX + cardWidth/2 && fourthY >= deckY)
				{thirdX = handX3;}
				if(fourthX > fifthX - cardWidth/2 && fourthY >= deckY)
				{fifthX = handX3;}
				if(fourthX < fifthX + cardWidth/2 && fourthY >= deckY)
				{fifthX = handX4;}
			}
			if(cardFourSelected == true)
			{
				fifthX = arg0.getX() - cardWidth/2;
				fifthY = arg0.getY() - cardHeight/2;
				if(fifthX > firstX - cardWidth/2 && fifthY >= deckY)
				{firstX = handX0;}
				if(fifthX < firstX + cardWidth/2 && fifthY >= deckY)
				{firstX = handX1;}
				if(fifthX > secondX - cardWidth/2 && fifthY >= deckY)
				{secondX = handX1;}
				if(fifthX < secondX + cardWidth/2 && fifthY >= deckY)
				{secondX = handX2;}
				if(fifthX > thirdX - cardWidth/2 && fifthY >= deckY)
				{thirdX = handX2;}
				if(fifthX < thirdX + cardWidth/2 && fifthY >= deckY)
				{thirdX = handX3;}
				if(fifthX > fourthX - cardWidth/2 && fifthY >= deckY)
				{fourthX = handX3;}
				if(fifthX < fourthX + cardWidth/2 && fifthY >= deckY)
				{fourthX = handX4;}
			}	
//-------------------------------------------------------------------------
			// TODO Book mark
			if(Prophacy.size() > 4)
			{
			if(Ip == true)
			{
				IX = arg0.getX() - cardWidth/2;
				IY = arg0.getY() - cardHeight/2;
				if(IX > IIX - cardWidth/2 && IY >= limboY)
				{IIX = handX0;}
				if(IX < IIX + cardWidth/2 && IY >= limboY)
				{IIX = handX1;}
				if(IX > IIIX - cardWidth/2 && IY >= limboY)
				{IIIX = handX1;}
				if(IX < IIIX + cardWidth/2 && IY >= limboY)
				{IIIX = handX2;}
				if(IX > IVX - cardWidth/2 && IY >= limboY)
				{IVX = handX2;}
				if(IX < IVX + cardWidth/2 && IY >= limboY)
				{IVX = handX3;}
				if(IX > VX - cardWidth/2 && IY >= limboY)
				{VX = handX3;}
				if(IX < VX + cardWidth/2 && IY >= limboY)
				{VX = handX4;}
			}
			if(IIp == true)
			{
				IIX = arg0.getX() - cardWidth/2;
				IIY = arg0.getY() - cardHeight/2;
				if(IIX > IX - cardWidth/2 && IIY >= limboY)
				{IX = handX0;}
				if(IIX < IX + cardWidth/2 && IIY >= limboY)
				{IX = handX1;}
				if(IIX > IIIX - cardWidth/2 && IIY >= limboY)
				{IIIX = handX1;}
				if(IIX < IIIX + cardWidth/2 && IIY >= limboY)
				{IIIX = handX2;}
				if(IIX > IVX - cardWidth/2 && IIY >= limboY)
				{IVX = handX2;}
				if(IIX < IVX + cardWidth/2 && IIY >= limboY)
				{IVX = handX3;}
				if(IIX > VX - cardWidth/2 && IIY >= limboY)
				{VX = handX3;}
				if(IIX < VX + cardWidth/2 && IIY >= limboY)
				{VX = handX4;}
			}
			if(IIIp == true)
			{
				IIIX = arg0.getX() - cardWidth/2;
				IIIY = arg0.getY() - cardHeight/2;
				if(IIIX > IX - cardWidth/2 && IIIY >= limboY)
				{IX = handX0;}
				if(IIIX < IX + cardWidth/2 && IIIY >= limboY)
				{IX = handX1;}
				if(IIIX > IIX - cardWidth/2 && IIIY >= limboY)
				{IIX = handX1;}
				if(IIIX < IIX + cardWidth/2 && IIIY >= limboY)
				{IIX = handX2;}
				if(IIIX > IVX - cardWidth/2 && IIIY >= limboY)
				{IVX = handX2;}
				if(IIIX < IVX + cardWidth/2 && IIIY >= limboY)
				{IVX = handX3;}
				if(IIIX > VX - cardWidth/2 && IIIY >= limboY)
				{VX = handX3;}
				if(IIIX < VX + cardWidth/2 && IIIY >= limboY)
				{VX = handX4;}
			}
			if(IVp == true)
			{
				IVX = arg0.getX() - cardWidth/2;
				IVY = arg0.getY() - cardHeight/2;
				if(IVX > IX - cardWidth/2 && IVY >= limboY)
				{IX = handX0;}
				if(IVX < IX + cardWidth/2 && IVY >= limboY)
				{IX = handX1;}
				if(IVX > IIX - cardWidth/2 && IVY >= limboY)
				{IIX = handX1;}
				if(IVX < IIX + cardWidth/2 && IVY >= limboY)
				{IIX = handX2;}
				if(IVX > IIIX - cardWidth/2 && IVY >= limboY)
				{IIIX = handX2;}
				if(IVX < IIIX + cardWidth/2 && IVY >= limboY)
				{IIIX = handX3;}
				if(IVX > VX - cardWidth/2 && IVY >= limboY)
				{VX = handX3;}
				if(IVX < VX + cardWidth/2 && IVY >= limboY)
				{VX = handX4;}
			}
			if(Vp == true)
			{
				VX = arg0.getX() - cardWidth/2;
				VY = arg0.getY() - cardHeight/2;
				if(VX > IX - cardWidth/2 && VY >= limboY)
				{IX = handX0;}
				if(VX < IX + cardWidth/2 && VY >= limboY)
				{IX = handX1;}
				if(VX > IIX - cardWidth/2 && VY >= limboY)
				{IIX = handX1;}
				if(VX < IIX + cardWidth/2 && VY >= limboY)
				{IIX = handX2;}
				if(VX > IIIX - cardWidth/2 && VY >= limboY)
				{IIIX = handX2;}
				if(VX < IIIX + cardWidth/2 && VY >= limboY)
				{IIIX = handX3;}
				if(VX > IVX - cardWidth/2 && VY >= limboY)
				{IVX = handX3;}
				if(VX < IVX + cardWidth/2 && VY >= limboY)
				{IVX = handX4;}
			}
			}
		}

		@Override
		public void mouseMoved(MouseEvent arg0) 
		{
			
		}

		public void KeysAndLocks()
		{
			if(TanDoor == true && Hand.get(HandCard) > 0 && Hand.get(HandCard) <= 9)
			{
				Doors.add(Hand.remove(4));
				TanDoor = false;
			}
			if(BlueDoor == true && Hand.get(HandCard) > 24 && Hand.get(HandCard) <= 30)
			{
				Doors.add(Hand.remove(4));
				BlueDoor = false;
			}
			if(GreenDoor == true && Hand.get(HandCard) > 38 && Hand.get(HandCard) <= 42)
			{
				Doors.add(Hand.remove(4));
				GreenDoor = false;
			}
			if(RedDoor == true && Hand.get(HandCard) > 49 && Hand.get(HandCard) <= 52)
			{
				Doors.add(Hand.remove(4));
				RedDoor = false;
			}
		}
		public void NightmaresAndKeys()
		{
			if(Nightmare == true)
				if((Hand.get(HandCard) > 0 && Hand.get(HandCard) <= 9) || (Hand.get(HandCard) > 24 && Hand.get(HandCard) <= 30) || (Hand.get(HandCard) > 38 && Hand.get(HandCard) <= 42) || (Hand.get(HandCard) > 49 && Hand.get(HandCard) <= 52))
				{
					System.out.println("Checkpoint 3");
					Discard.add(Hand.remove(4));
					Discard.add(Hand.remove(HandCard));
					Nightmare = false;
				}
		}
		@Override
		public void mouseClicked(MouseEvent e) 
		{
			System.out.println("MouseClicked");
			
			System.out.println("Checkpoint 1");

				System.out.println("Checkpoint 2");
				
				if(e.getX() >= firstX && e.getX() <= firstX+cardWidth && e.getY() >= firstY && e.getY() <= firstY+cardHeight)
				{
					HandCard = 0;
					NightmaresAndKeys();
					KeysAndLocks();
				}
				else if(e.getX() >= secondX && e.getX() <= secondX+cardWidth && e.getY() >= secondY && e.getY() <= secondY+cardHeight)
				{
					HandCard = 1;
					NightmaresAndKeys();
					KeysAndLocks();
				}
				else if(e.getX() >= thirdX && e.getX() <= thirdX+cardWidth && e.getY() >= thirdY && e.getY() <= thirdY+cardHeight)
				{
					HandCard = 2;
					NightmaresAndKeys();
					KeysAndLocks();
				}
				else if(e.getX() >= fourthX && e.getX() <= fourthX+cardWidth && e.getY() >= fourthY && e.getY() <= fourthY+cardHeight)
				{
					HandCard = 3;
					NightmaresAndKeys();
					KeysAndLocks();
				}
				else if(e.getX() >= fifthX && e.getX() <= fifthX+cardWidth && e.getY() >= fifthY && e.getY() <= fifthY+cardHeight)
					{
						if(Nightmare == true)
						{
							Discard.add(Hand.remove(4));
							if(Prophacy.size() > 0)
								while(Prophacy.size() > 0)
								{
									Deck.add(Prophacy.remove(0));
								}
							
							for(int i = 0; i < 5; i++)
								Discard.add(Deck.remove(0));
							Nightmare = false;
						}
					}
				
		}

		public void Unused()
		{
			Deck.add(randy.nextInt(Deck.size()), Hand.remove(4));
			DoorsOrNO = false;
			TanDoor = false;
			GreenDoor = false;
			BlueDoor = false;
			RedDoor = false;
		}

		public void mP()
		{
			if(TanDoor == true)
			{
				Unused();
			}
			if(BlueDoor == true)
			{
				Unused();
			}
			if(GreenDoor == true)
			{
				Unused();
			}
			if(RedDoor == true)
			{
				Unused();
			}
			if(Hand.size() == 5)
			{
				cardSelected = true;
				card = true;
				cardO = false;
				cardT = false;
				cardTh = false;
				cardF = false;
			}
		}
		public void mP1()
		{
			if(TanDoor == true)
			{
				Unused();
			}
			if(BlueDoor == true)
			{
				Unused();
			}
			if(GreenDoor == true)
			{
				Unused();
			}
			if(RedDoor == true)
			{
				Unused();
			}
			if(Hand.size() == 5)
			{
				cardOneSelected = true;
				card = false;
				cardO = true;
				cardT = false;
				cardTh = false;
				cardF = false;
			}
		}
		public void mP2()
		{
			if(TanDoor == true)
			{
				Unused();
			}
			if(BlueDoor == true)
			{
				Unused();
			}
			if(GreenDoor == true)
			{
				Unused();
			}
			if(RedDoor == true)
			{
				Unused();
			}
			if(Hand.size() == 5)
			{
				cardTwoSelected = true;
				card = false;
				cardO = false;
				cardT = true;
				cardTh = false;
				cardF = false;	
			}
		}
		public void mP3()
		{
			if(TanDoor == true)
			{
				Unused();
			}
			if(BlueDoor == true)
			{
				Unused();
			}
			if(GreenDoor == true)
			{
				Unused();
			}
			if(RedDoor == true)
			{
				Unused();
			}
			if(Hand.size() == 5)
			{
					cardThreeSelected = true;
					card = false;
					cardO = false;
					cardT = false;
					cardTh = true;
					cardF = false;
			}
		}
		public void mP4()
		{
			if(TanDoor == true)
			{
				Unused();
			}
			if(BlueDoor == true)
			{
				Unused();
			}
			if(GreenDoor == true)
			{
				Unused();
			}
			if(RedDoor == true)
			{
				Unused();
			}
			{
				cardFourSelected = true;
				card = false;
				cardO = false;
				cardT = false;
				cardTh = false;
				cardF = true;
			}
		}
		

		
		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			if(Nightmare == false)
			{
			System.out.println("mousePressed");
			if(e.getX() >= CBX && e.getX() <= CBX+cardWidth && e.getY() >= CBY && e.getY() <= CBY+cardHeight)
			{
				DrawCard();
			}
			if(e.getX() >= firstX && e.getX() <= firstX+cardWidth && e.getY() >= firstY && e.getY() <= firstY+cardHeight)
			{
				mP();
			}
			else 
				cardSelected = false;
			
			if(e.getX() >= secondX && e.getX() <= secondX+cardWidth && e.getY() >= secondY && e.getY() <= secondY+cardHeight)
			{
				mP1();
			}
			else 
				cardOneSelected = false;
			
			if(e.getX() >= thirdX && e.getX() <= thirdX+cardWidth && e.getY() >= thirdY && e.getY() <= thirdY+cardHeight)
			{
				mP2();
			}
			else 
				cardTwoSelected = false;
			
			if(e.getX() >= fourthX && e.getX() <= fourthX+cardWidth && e.getY() >= fourthY && e.getY() <= fourthY+cardHeight)
			{
				mP3();

			}
			else 
				cardThreeSelected = false;
			if(e.getX() >= fifthX && e.getX() <= fifthX+cardWidth && e.getY() >= fifthY && e.getY() <= fifthY+cardHeight)
			{
				mP4(); 
			}
			else 
				cardFourSelected = false;
			//TODO putDownCards(Stack.get(stackCounter), g, (cardWidth*2)+(15*stackCounter), stackPoint);
			if(e.getX() >= (cardWidth*2)+(15*stackCounter) && e.getX() <= (cardWidth*3)+(15*stackCounter) && e.getY() >= stackPoint && e.getY() <= stackPoint + cardHeight && Hand.size() < 5)
			{
				Hand.add(Stack.remove(Stack.size() - 1));
			}
			
			//______________________________________________________________________________________
			if(e.getX() >= firstX && e.getX() <= firstX+cardWidth && e.getY() >= limboY && e.getY() <= limboY+cardHeight)
			{
				Ip = true;
				IIp = false;
				IIIp = false;
				IVp = false;
				Vp = false;
			}
			else 
				Ip = false;
			if(e.getX() >= secondX && e.getX() <= secondX+cardWidth && e.getY() >= limboY && e.getY() <= limboY+cardHeight )
			{
				Ip = false;
				IIp = true;
				IIIp = false;
				IVp = false;
				Vp = false;
			}
			else
				IIp = false;
			if(e.getX() >= thirdX && e.getX() <= thirdX+cardWidth && e.getY() >= limboY && e.getY() <= limboY+cardHeight)
			{
				Ip = false;
				IIp = false;
				IIIp = true;
				IVp = false;
				Vp = false;
			}
			else 
				IIIp = false;
			if(e.getX() >= fourthX && e.getX() <= fourthX+cardWidth && e.getY() >= limboY && e.getY() <= limboY+cardHeight)
			{
				Ip = false;
				IIp = false;
				IIIp = false;
				IVp = true;
				Vp = false;

			}
			else 
				IVp = false;
			if(e.getX() >= fifthX && e.getX() <= fifthX+cardWidth && e.getY() >= limboY && e.getY() <= limboY+cardHeight)
			{
				Ip = false;
				IIp = false;
				IIIp = false;
				IVp = false;
				Vp = true;
			}
			else 
				Vp = false;
			}
		}
		public int SimpleNumber(int a)
		{
				 if(a <= 9){return 1;}//Tan
			else if(a <= 17){return 2;}//Tan
			else if(a <= 24){return 3;}//Tan
			else if(a <= 30){return 4;}//Blue
			else if(a <= 34){return 5;}//Blue
			else if(a <= 38){return 6;}//Blue
			else if(a <= 42){return 7;}//Green
			else if(a <= 46){return 8;}//Green
			else if(a <= 49){return 9;}//Green
			else if(a <= 52){return 10;}//Red
			else if(a <= 55){return 11;}//Red
			else if(a <= 58){return 12;}//Red
			else if(a <= 68){return 13;}//
			else if(a <= 70){return 14;}//
			else if(a <= 72){return 15;}//
			else if(a <= 74){return 16;}//
			else if(a <= 76){return 17;}//
				return 0;
		}
		public String CardColor(int b)
		{
			 if(b == 1 || b == 2 || b == 3){return "Tan";}
		else if(b == 4 || b == 5 || b == 6){return "Blue";}
		else if(b == 7 || b == 8 || b == 9){return "Green";}
		else if(b == 10 || b == 11 || b == 12){return "Red";}
			 return null;
		}
		public String CardType(int c)
		{
			 if(c == 1 || c == 4 || c == 7 || c == 10){return "Key";}
		else if(c == 2 || c == 5 || c == 8 || c == 11){return "Sun";}
		else if(c == 3 || c == 6 || c == 9 || c == 12){return "Moon";}
			 return null;
		}
		public void isCardCorrect()
		{
				int newCard = 0;	newCard = SimpleNumber(Hand.get(HandCard));
				int topCard = 0;	topCard = SimpleNumber(Stack.get(Stack.size()-1)); 
				
				
					FA = CardColor(newCard);
					FB = CardType(newCard);
				
					SA = CardColor(topCard);
					SB = CardType(topCard);
					 if(FB != SB)
					 {
						 doubleStack.add(Hand.get(HandCard));
						 Stack.add(Hand.remove(HandCard));
					 }
				doors();
				
		}
		public void doors()
		{
			
			int topCard = 0;	
			int secondCard = 0;	 
			int thirdCard = 0;	
			String tC = "";
			String sC = "";
			String thC = "";
			
			if(doubleStack.size() >= 3)
			{
				topCard = doubleStack.get(doubleStack.size() - 1); 
				secondCard = doubleStack.get(doubleStack.size() - 2);
				thirdCard = doubleStack.get(doubleStack.size() - 3);
				tC = CardColor(SimpleNumber(doubleStack.get(doubleStack.size() - 1)));
				sC = CardColor(SimpleNumber(doubleStack.get(doubleStack.size() - 2)));
				thC = CardColor(SimpleNumber(doubleStack.get(doubleStack.size() - 3)));
				int tan = 0;int blue = 0;int green = 0;int red = 0;
				for(int i = 0; i < Doors.size(); i++)
				{
					if(Doors.get(i) == 70)
						tan++;
					if(Doors.get(i) == 72)
						blue++;
					if(Doors.get(i) == 74)
						green++;
					if(Doors.get(i) == 76)
						red++;
				}
				if(tC == sC && sC == thC)
				{
					if(tC == "Tan" && tan < 2)
					{
						Doors.add(70);
					}
					else if(tC == "Blue" && blue < 2)
					{
						Doors.add(72);
					}
					else if(tC == "Green" && green < 2)
					{
						Doors.add(74);
					}
					else if(tC == "Red" && red < 2)
					{
						Doors.add(76);
					}
					else if(red == 2 && tan == 2 && green == 2 && blue == 2)
					{
						System.out.println("YOU WIN YOU WIN DKJFLKSDJVBOIGEJWSOIUPVJN EIUWOSHNFCIUOJESHJOVICESJHOIVJESIOKLJVKLSDJKLVJSDKLJVDSKLJVLKDSJVLKDSJVLKDSJVLKDSVJLKDSJVLKDSJVL:DSKJVLK:DSJVKDL:SJVDSKL:VJDSL:K");
					}
					doubleStack.remove(0);doubleStack.remove(0);doubleStack.remove(0);
				}
			}
		}
		public void isCardSecond()
		{
				int O = 0;
				int T = 0;
				// The K number for the card being placed
				O = SimpleNumber(Hand.get(HandCard));
				// The K number for the card that is first on the stack
				T = SimpleNumber(Stack.get(Stack.size()-1));
				FB = CardType(O);
				SB = CardType(T);
					 if(FB != SB)
					 {
						 doubleStack.add(Hand.get(HandCard));
						 Stack.add(Hand.remove(HandCard));
					 }
		}
		public void isCardOnStack(int x, int y)
		{
			//if the y value of the card is above the hand and to the right of the discard pile
			if(y < bottomLineYcoord && x > cardWidth + 5)
			{
				if(Stack.size() == 0)
				{
					doubleStack.add(Hand.get(HandCard));
					Stack.add(Hand.remove(HandCard));
				}
				else if(Stack.size() == 1 )
				{
					isCardSecond();
				}
				else if(Stack.size() >= 2)
				{
					isCardCorrect();
					
				}
			}
		}
		public void isCardDiscard(int x, int y)
		{
			if(x < cardWidth + 5 && y < deckY-10 && Hand.get(HandCard) < 58) //TODO
			{
				if((Hand.get(HandCard) > 0 && Hand.get(HandCard) <= 9) || (Hand.get(HandCard) > 24 && Hand.get(HandCard) <= 30) || (Hand.get(HandCard) > 38 && Hand.get(HandCard) <= 42) || (Hand.get(HandCard) > 49 && Hand.get(HandCard) <= 52))
				{
					System.out.println("isCardDiscard showed that a key was discarded");
					prophit();
				}
				Discard.add(Hand.remove(HandCard));
			}
		}

		
		public void whereIsTheCard(int x, int y)
		{	
			isCardDiscard(x, y);
			isCardOnStack(x, y);
		}
		
		public void Moved()
		{	
			if(cardFourSelected == true)
			{
				if(fifthX < firstX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(0, Hand.remove(4));}
				else if(fifthX < secondX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(1, Hand.remove(4));}
				else if(fifthX < thirdX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(2, Hand.remove(4));}
				else if(fifthX < fourthX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(3, Hand.remove(4));}
			}
			if(cardThreeSelected == true)
			{	
				if(fourthX < firstX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(0, Hand.remove(3));}
				else if(fourthX < secondX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(1, Hand.remove(3));}		
				else if(fourthX < thirdX + cardWidth/2 && fifthY >= deckY)
				{Hand.add(2, Hand.remove(3));}
				else if(fourthX > fifthX - cardWidth/2 && fifthY >= deckY)
				{Hand.add(4, Hand.remove(3));}
			}
			if(cardTwoSelected == true)
			{
				if(thirdX < firstX + cardWidth/2 && thirdY >= deckY)
				{Hand.add(0, Hand.remove(2));}
				else if(thirdX < secondX + cardWidth/2 && thirdY >= deckY)
				{Hand.add(1, Hand.remove(2));}
				else if(thirdX > fifthX - cardWidth/2 && thirdY >= deckY)
				{Hand.add(4, Hand.remove(2));}
				else if(thirdX > fourthX - cardWidth/2 && thirdY >= deckY)
				{Hand.add(3, Hand.remove(2));}
			}
			if(cardOneSelected == true)
			{
				if(secondX < firstX + cardWidth/2 && secondY >= deckY)
				{Hand.add(0, Hand.remove(1));}
				else if(secondX > fifthX - cardWidth/2 && secondY >= deckY)
				{Hand.add(4, Hand.remove(1));}
				else if(secondX > fourthX - cardWidth/2 && secondY >= deckY)
				{Hand.add(3, Hand.remove(1));}
				else if(secondX > thirdX - cardWidth/2 && secondY >= deckY)
				{Hand.add(2, Hand.remove(1));}
			}
			if(cardSelected == true)
			{
				if(firstX > fifthX - cardWidth/2 && firstY >= deckY)
				{Hand.add(4, Hand.remove(0));}
				else if(firstX > fourthX - cardWidth/2 && firstY >= deckY)
				{Hand.add(3, Hand.remove(0));}
				else if(firstX > thirdX - cardWidth/2 && firstY >= deckY)
				{Hand.add(2, Hand.remove(0));}
				else if(firstX > secondX - cardWidth/2 && firstY >= deckY)
				{Hand.add(1, Hand.remove(0));}
			}
		}
		public void ProphitsWords()
		{
			if(Prophacy.size() > 4)
			{
			if(Vp == true)
			{
				if(VX < IX + cardWidth/2 && VY >= limboY)
				{Prophacy.add(0, Prophacy.remove(4));}
				else if(VX < IIX + cardWidth/2 && VY >= limboY)
				{Prophacy.add(1, Prophacy.remove(4));}
				else if(VX < IIIX + cardWidth/2 && VY >= limboY)
				{Prophacy.add(2, Prophacy.remove(4));}
				else if(VX < IVX + cardWidth/2 && VY >= limboY)
				{Prophacy.add(3, Prophacy.remove(4));}
			}
			if(IVp == true)
			{	
				if(IVX < IX + cardWidth/2 && IVY >= limboY)
				{Prophacy.add(0, Prophacy.remove(3));}
				else if(IVX < IIX + cardWidth/2 && IVY >= limboY)
				{Prophacy.add(1, Prophacy.remove(3));}		
				else if(IVX < IIIX + cardWidth/2 && IVY >= limboY)
				{Prophacy.add(2, Prophacy.remove(3));}
				else if(IVX > VX - cardWidth/2 && IVY >= limboY)
				{Prophacy.add(4, Prophacy.remove(3));}
			}
			if(IIIp == true)
			{
				if(IIIX < IX + cardWidth/2 && IIIY >= limboY)
				{Prophacy.add(0, Prophacy.remove(2));}
				else if(IIIX < IIX + cardWidth/2 && IIIY >= limboY)
				{Prophacy.add(1, Prophacy.remove(2));}
				else if(IIIX > IVX - cardWidth/2 && IIIY >= limboY)
				{Prophacy.add(4, Prophacy.remove(2));}
				else if(IIIX > VX - cardWidth/2 && IIIY >= limboY)
				{Prophacy.add(3, Prophacy.remove(2));}
			}
			if(IIp == true)
			{
				if(IIX < IX + cardWidth/2 && IIY >= limboY)
				{Prophacy.add(0, Prophacy.remove(1));}
				else if(IIX > VX - cardWidth/2 && IIY >= limboY)
				{Prophacy.add(4, Prophacy.remove(1));}
				else if(IIX > IVX - cardWidth/2 && IIY >= limboY)
				{Prophacy.add(3, Prophacy.remove(1));}
				else if(IIX > IIIX - cardWidth/2 && IIY >= limboY)
				{Prophacy.add(2, Prophacy.remove(1));}
			}
			if(Ip == true)
			{
				if(IX > VX - cardWidth/2 && IY >= limboY)
				{Prophacy.add(4, Prophacy.remove(0));}
				else if(IX > IVX - cardWidth/2 && IY >= limboY)
				{Prophacy.add(3, Prophacy.remove(0));}
				else if(IX > IIIX - cardWidth/2 && IY >= limboY)
				{Prophacy.add(2, Prophacy.remove(0));}
				else if(IX > IIX - cardWidth/2 && IY >= limboY)
				{Prophacy.add(1, Prophacy.remove(0));}
			}
		}
		}
		
		public void TheSacrifice(int x, int y)
		{

			if(x < cardWidth -15 && y < deckY && Prophacy.get(Ps) < 68)
			{
				Discard.add(Prophacy.remove(Ps));
			}
		}
		
		@Override
		public void mouseReleased(MouseEvent e) 
		{
			System.out.println("mouseReleased");
				Moved();
			HandCard = 0;
			
			whereIsTheCard(firstX, firstY);
			firstX = cardSpace*1;
			firstY = deckY;	
			
			HandCard = 1;
			whereIsTheCard(secondX, secondY);
			secondX = cardSpace*2;
			secondY = deckY;
			
			HandCard = 2;
			whereIsTheCard(thirdX, thirdY);
			thirdX = cardSpace*3;
			thirdY = deckY;	
			
			HandCard = 3;
			whereIsTheCard(fourthX, fourthY);
			fourthX = cardSpace*4;
			fourthY = deckY;	
			
			HandCard = 4;
			whereIsTheCard(fifthX, fifthY);
			fifthX = cardSpace*5;
			fifthY = deckY;	
			if(Prophacy.size() > 0)
			{
				ProphitsWords();
				Ps = 0;
				TheSacrifice(IX, IY);
				IX = cardSpace*1;
				IY = limboY;	
				
				Ps = 1;
				TheSacrifice(IIX, IIY);
				IIX = cardSpace*2;
				IIY = limboY;
				
				Ps = 2;
				TheSacrifice(IIIX, IIIY);
				IIIX = cardSpace*3;
				IIIY = limboY;	
				
				Ps = 3;
				TheSacrifice(IVX, IVY);
				IVX = cardSpace*4;
				IVY = limboY;	
				
				Ps = 4;
				TheSacrifice(VX, VY);
				VX = cardSpace*5;
				VY = limboY;	
			}

			repaint();
			
		}
		
	}
}
