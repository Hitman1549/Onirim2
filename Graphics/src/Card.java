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
	
	public static int DeckSize = 76;
	public static ArrayList<Integer> CardsN = new ArrayList<Integer>();
	public static ArrayList<Integer> Deck = new ArrayList<Integer>();
	public static ArrayList<Integer> Hand = new ArrayList<Integer>();
	public static ArrayList<Integer> Stack = new ArrayList<Integer>();
	public static ArrayList<Integer> Limbo = new ArrayList<Integer>();
	public static ArrayList<Integer> Discard = new ArrayList<Integer>();
	public static ArrayList<Integer> Doors = new ArrayList<Integer>();
	
	public static boolean repeat = false;
	public boolean card, cardO, cardT, cardTh, cardF;
	private boolean cardSelected = false;
	private boolean cardOneSelected = false;
	private boolean cardTwoSelected = false;
	private boolean cardThreeSelected = false;
	private boolean cardFourSelected = false;
	
	private int number = 0;
	
//	private String TD = "TanDoor.png";
//	private String RD = "RedDoor.png";
//	private String BD = "BlueDoor.png";
//	private String GD = "GreenDoor.png";
	
	private String TD = "CardBack.png";
	private String RD = "CardBack.png";
	private String BD = "CardBack.png";
	private String GD = "CardBack.png";
	
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
	// Ancor fields
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
	//Coorodinints 
	public int deckX = 1;
	public int deckY = boardHeight - (cardHeight + 40);
	public int firstX = cardSpace*1;
	public int secondX = cardSpace*2;
	public int thirdX = cardSpace*3;
	public int fourthX = cardSpace*4;
	public int fifthX = cardSpace*5;
	
	public int limboY = deckY - cardHeight - 10;
	
	public int firstY = deckY;
	public int secondY = deckY;
	public int thirdY = deckY;
	public int fourthY = deckY;
	public int fifthY = deckY;
	
	public int bottomLineYcoord = boardHeight - (cardHeight + 50);
	
	public Card()
	{
		makeEnvironment();
		
		//Tan Cards
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
		
		
		//Green Cards
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
		
		
		
		//Blue Cards
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
		
		
		
		//Red Cards
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
		
		
		//Nightmear
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
	//Tan Cards
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
	
	//Blue Cards
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
	
	//Green Cards
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
	
	//Red Cards
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
	
	//Nightmare cards
	public void drawNs(Graphics g, int X, int Y)
	{
		g.drawImage(ImageNS, X, Y, cardWidth, cardHeight, null);
		repaint();
	}
	
	//Card Back
	public void drawCB(Graphics g, int X, int Y)
	{
		g.drawImage(ImageCB, X, Y, cardWidth, cardHeight, null);
	}
	
	//Doors
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
//		for(int i = 0; i <= 76; i++)
//			System.out.print(i + ",");
	}
	public void DrawCard()
	{
		if(Hand.size() < 5)
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
					if(firstDraw == false)
						System.out.println("FirstDraw = False");
					else
						System.out.println("Wtf just happend?");
				}
				if(firstDraw == false && Hand.size() < 5)
				{
					Hand.add(Hand.size(), Deck.remove(0));
				}
//			System.out.print(Hand.get(Hand.size()-1) + " ");
			System.out.println("Deck Size =" + Deck.size() + " ");
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
	public void drawStack()
	{
		
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
		
		repaint();

	}
	public void drawCards(Graphics g)
	{
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e){
			//TODO Auto-generated catch block
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
		
		
		@Override
		public void mouseDragged(MouseEvent arg0) 
		{
			if(cardSelected == true)
			{
				firstX = arg0.getX() - cardWidth/2;
				firstY = arg0.getY() - cardHeight/2;
			}
			if(cardOneSelected == true)
			{
				secondX = arg0.getX() - cardWidth/2;
				secondY = arg0.getY() - cardHeight/2;
			}
			if(cardTwoSelected == true)
			{
				thirdX = arg0.getX() - cardWidth/2;
				thirdY = arg0.getY() - cardHeight/2;
			}
			if(cardThreeSelected == true)
			{
				fourthX = arg0.getX() - cardWidth/2;
				fourthY = arg0.getY() - cardHeight/2;
			}
			if(cardFourSelected == true)
			{
				fifthX = arg0.getX() - cardWidth/2;
				fifthY = arg0.getY() - cardHeight/2;
			}
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}




		@Override
		public void mouseClicked(MouseEvent e) 
		{
			if(cardSelected == true)
			{
				cardSelected = false;
			}
			if(cardOneSelected == true)
			{
				cardOneSelected = false;
			}
			if(cardTwoSelected == true)
			{
				cardTwoSelected = false;
			}
			if(cardThreeSelected == true)
			{
				cardThreeSelected = false;
			}
			if(cardFourSelected == true)
			{
				cardFourSelected = false;
			}
		}

		public void mP()
		{
			if(Hand.size() == 5)
			{
				if(58 < Hand.get(0) && Hand.get(0) < 68)
				{
					Hand.remove(0);
					for(int i = 0; i < 5; i++)
						Deck.remove(0);
				}
				cardSelected = true;
				card = true;
				cardO = false;
				cardT = false;
				cardTh = false;
				cardF = false;
				System.out.println("Card1 Selected");	
		}
		}
		public void mP1()
		{
			if(Hand.size() == 5)
			{
				if(58 < Hand.get(1) && Hand.get(1) < 68)
				{
					Hand.remove(1);
					for(int i = 0; i < 5; i++)
						Deck.remove(0);
				}
				cardOneSelected = true;
				card = false;
				cardO = true;
				cardT = false;
				cardTh = false;
				cardF = false;
				System.out.println("CardOne Selected");		
		}
		}
		public void mP2()
		{
			if(Hand.size() == 5)
			{
				if(58 < Hand.get(2) && Hand.get(2) < 68)
				{
					Hand.remove(2);
					for(int i = 0; i < 5; i++)
						Deck.remove(0);
				}
				cardTwoSelected = true;
				card = false;
				cardO = false;
				cardT = true;
				cardTh = false;
				cardF = false;
				System.out.println("CardTwo Selected");		
		}
		}
		public void mP3()
		{
			if(Hand.size() == 5)
			{
				if(58 < Hand.get(3) && Hand.get(3) < 68)
				{
					Hand.remove(3);
					for(int i = 0; i < 5; i++)
						Deck.remove(0);
				}
					cardThreeSelected = true;
					card = false;
					cardO = false;
					cardT = false;
					cardTh = true;
					cardF = false;
					System.out.println("CardThree Selected");
		}
		}
		public void mP4()
		{
			if(Hand.size() == 5)
			{
				if(58 < Hand.get(4) && Hand.get(4) < 68)
				{
					Hand.remove(4);
				for(int i = 0; i < 5; i++)
					Deck.remove(0);
				}
				cardFourSelected = true;
				card = false;
				cardO = false;
				cardT = false;
				cardTh = false;
				cardF = true;
				System.out.println("Cardfour Selected");
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) 
		{
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
			
			if(e.getX() >= secondX && e.getX() <= secondX+cardWidth && e.getY() >= secondY && e.getY() <= secondY+cardHeight )
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
		}
		public void isCardCorrect(int a, int b, int c)
		{
			int O = 0;
			int T = 0;
				 if(a <= 9){O=1;FA="Tan";FB = "Key";}
			else if(a <= 17){O=2;FA="Tan";FB = "Sun";}
			else if(a <= 24){O=3;FA="Tan";FB = "Moon";}
			else if(a <= 30){O=4;FA="Blue";FB = "Key";}
			else if(a <= 34){O=5;FA="Blue";FB = "Sun";}
			else if(a <= 38){O=6;FA="Blue";FB = "Moon";}
			else if(a <= 42){O=7;FA="Green";FB = "Key";}
			else if(a <= 46){O=8;FA="Green";FB = "Sun";}
			else if(a <= 49){O=9;FA="Green";FB = "Moon";}
			else if(a <= 52){O=10;FA="Red";FB = "Key";}
			else if(a <= 55){O=11;FA="Red";FB = "Sun";}
			else if(a <= 58){O=12;FA="Red";FB = "Moon";}
			else if(a <= 68){O=13;FA="Nightmare";}
			else if(a <= 70){O=14;FA="TanDoor";}
			else if(a <= 72){O=15;FA="BlueDoor";}
			else if(a <= 74){O=16;FA="GreenDoor";}
			else if(a <= 76){O=17;FA="RedDoor";}
				 
				 if(b <= 9){T=1;SA="Tan";SB = "Key";}
			else if(b <= 17){T=2;SA="Tan";SB = "Sun";}
			else if(b <= 24){T=3;SA="Tan";SB = "Moon";}
			else if(b <= 30){T=4;SA="Blue";SB = "Key";}
			else if(b <= 34){T=5;SA="Blue";SB = "Sun";}
			else if(b <= 38){T=6;SA="Blue";SB = "Moon";}
			else if(b <= 42){T=7;SA="Green";SB = "Key";}
			else if(b <= 46){T=8;SA="Green";SB = "Sun";}
			else if(b <= 49){T=9;SA="Green";SB = "Moon";}
			else if(b <= 52){T=10;SA="Red";SB = "Key";}
			else if(b <= 55){T=11;SA="Red";SB = "Sun";}
			else if(b <= 58){T=12;SA="Red";SB = "Moon";}
			else if(b <= 68){T=13;SA="Nightmare";}
			else if(b <= 70){T=14;SA="TanDoor";}
			else if(b <= 72){T=15;SA="BlueDoor";}
			else if(b <= 74){T=16;SA="GreenDoor";}
			else if(b <= 76){T=17;SA="RedDoor";}

				
				 if(c <= 9){TA="Tan";TB = "Key";}
			else if(c <= 17){TA="Tan";TB = "Sun";}
			else if(c <= 24){TA="Tan";TB = "Moon";}
			else if(c <= 30){TA="Blue";TB = "Key";}
			else if(c <= 34){TA="Blue";TB = "Sun";}
			else if(c <= 38){TA="Blue";TB = "Moon";}
			else if(c <= 42){TA="Green";TB = "Key";}
			else if(c <= 46){TA="Green";TB = "Sun";}
			else if(c <= 49){TA="Green";TB = "Moon";}
			else if(c <= 52){TA="Red";TB = "Key";}
			else if(c <= 55){TA="Red";TB = "Sun";}
			else if(c <= 58){TA="Red";TB = "Moon";}
			else if(c <= 68){TA="Nightmare";}
			else if(c <= 70){TA="TanDoor";}
			else if(c <= 72){TA="BlueDoor";}
			else if(c <= 74){TA="GreenDoor";}
			else if(c <= 76){TA="RedDoor";}
			if(FA != SA)
			{
				Stack.add(Hand.remove(number));
				Doors(FA, SA, TA);
			}
		}
		public void Doors(String F, String S, String T)
		{
			if(F == S && S == T)
			{
				if(F == "Tan")
				{
					Doors.add(1);
				}
				if(F == "Blue")
				{
					Doors.add(2);
				}
				if(F == "Green")
				{
					Doors.add(3);
				}
				if(F == "Red")
				{
					Doors.add(4);
				}
				for(int i = 0; i < Doors.size(); i++)
				{
					System.out.print(Doors.get(i));
				}
			}
		}
		
		public void isCardSecond(int handCardone, int handCardTwo)
		{
				int O = 0;
				int T = 0;
					 if(handCardone <= 9){O=1;FB = "Key";}
				else if(handCardone <= 17){O=2;FB = "Sun";}
				else if(handCardone <= 24){O=3;FB = "Moon";}
				else if(handCardone <= 30){O=4;FB = "Key";} 
				else if(handCardone <= 34){O=5;FB = "Sun";}
				else if(handCardone <= 38){O=6;FB = "Moon";}
				else if(handCardone <= 42){O=7;FB = "Key";}
				else if(handCardone <= 46){O=8;FB = "Sun";}
				else if(handCardone <= 49){O=9;FB = "Moon";}
				else if(handCardone <= 52){O=10;FB = "Key";}
				else if(handCardone <= 55){O=11;FB = "Sun";}
				else if(handCardone <= 58){O=12;FB = "Moon";}
					 if(handCardTwo <= 9){T=1;SB = "Key";}
				else if(handCardTwo <= 17){T=2;SB = "Sun";}
				else if(handCardTwo <= 24){T=3;SB = "Moon";}
				else if(handCardTwo <= 30){T=4;SB = "Key";}
				else if(handCardTwo <= 34){T=5;SB = "Sun";}
				else if(handCardTwo <= 38){T=6;SB = "Moon";}
				else if(handCardTwo <= 42){T=7;SB = "Key";}
				else if(handCardTwo <= 46){T=8;SB = "Sun";}
				else if(handCardTwo <= 49){T=9;SB = "Moon";}
				else if(handCardTwo <= 52){T=10;SB = "Key";}
				else if(handCardTwo <= 55){T=11;SB = "Sun";}
				else if(handCardTwo <= 58){T=12;SB = "Moon";}
					 if(FB != SB)
					 {
						 Stack.add(Hand.remove(handCardone));
					 }
		}
		public void isCardOnStack(int x, int y, int HandCard)
		{
			//if the y value of the card is above the hand and to the right of the discard pile
			if(y < bottomLineYcoord && x > cardWidth + 5)
			{
				if(Stack.size() == 0)
				{
					Stack.add(Hand.remove(HandCard));
				}
				else if(Stack.size() == 1 )
				{
					int b = Stack.get(Stack.size()-1);
					isCardSecond(HandCard, b);
				}
				else if(Stack.size() > 1 && Stack.size() < 3)
				{
					isCardCorrect(HandCard, Stack.get(Stack.size()-1), Stack.get(Stack.size() - 2));
				}
			}
		}
		public void isCardDiscard(int x, int y, int a)
		{
			if(x < cardWidth + 5 && y < deckY-cardHeight && Hand.get(a) < 58)
			{
				Discard.add(Hand.remove(a));
			}
		}
		
		
		public void whereIsTheCard(int x, int y, int HandCard)
		{	
			isCardDiscard(x, y, HandCard);
			isCardOnStack(x, y, HandCard);
		}
		@Override
		public void mouseReleased(MouseEvent e) 
		{
			number = 0;
			whereIsTheCard(firstX, firstY, 0);
			firstX = cardSpace*1;
			firstY = deckY;	
			number = 1;
			whereIsTheCard(secondX, secondY, 1);
			secondX = cardSpace*2;
			secondY = deckY;	
			number = 2;
			whereIsTheCard(thirdX, thirdY, 2);
			thirdX = cardSpace*3;
			thirdY = deckY;	
			number = 3;
			whereIsTheCard(fourthX, fourthY, 3);
			fourthX = cardSpace*4;
			fourthY = deckY;	
			number = 4;
			whereIsTheCard(fifthX, fifthY, 4);
			fifthX = cardSpace*5;
			fifthY = deckY;	
			
			repaint();
			
		}
		
	}
}
