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
	public static int DeckSize = 76;
	public static ArrayList<Integer> CardsN = new ArrayList<Integer>();
	public static ArrayList<Integer> Deck = new ArrayList<Integer>();
	public static ArrayList<Integer> Hand = new ArrayList<Integer>();
	public static ArrayList<Integer> Stack = new ArrayList<Integer>();
	public static ArrayList<Integer> Limbo = new ArrayList<Integer>();
	public static ArrayList<Integer> Discard = new ArrayList<Integer>();
	public static ArrayList<String> Doors = new ArrayList<String>();
	public static ArrayList<String> Inception = new ArrayList<String>();
	public static boolean repeat = false;
	public boolean card, cardO, cardT, cardTh, cardF;
	private boolean cardSelected = false;
	private boolean cardOneSelected = false;
	private boolean cardTwoSelected = false;
	private boolean cardThreeSelected = false;
	private boolean cardFourSelected = false;
	private int number = 0;
	private String TD = "TanDoor.png";
	private String RD = "RedDoor.png";
	private String BD = "BlueDoor.png";
	private String GD = "GreenDoor.png";
//	private String TD = "CardBack.png";
//	private String RD = "CardBack.png";
//	private String BD = "CardBack.png";
//	private String GD = "CardBack.png";
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
	public boolean HALT = false;
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
		g.setColor(Color.orange);
		g.fillRect(0, 0, cardWidth + 5, deckY - 10);
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
		public int SimpleNumber(int a)
		{
				 if(a <= 9){return 1;}
			else if(a <= 17){return 2;}
			else if(a <= 24){return 3;}
			else if(a <= 30){return 4;}
			else if(a <= 34){return 5;}
			else if(a <= 38){return 6;}
			else if(a <= 42){return 7;}
			else if(a <= 46){return 8;}
			else if(a <= 49){return 9;}
			else if(a <= 52){return 10;}
			else if(a <= 55){return 11;}
			else if(a <= 58){return 12;}
			else if(a <= 68){return 13;}
			else if(a <= 70){return 14;}
			else if(a <= 72){return 15;}
			else if(a <= 74){return 16;}
			else if(a <= 76){return 17;}
				return 0;
		}
		public String CardColor(int b)
		{
			String fa = "";
			 if(b <= 9){fa="Tan";}
		else if(b <= 17){fa="Tan";}
		else if(b <= 24){fa="Tan";}
		else if(b <= 30){fa="Blue";}
		else if(b <= 34){fa="Blue";}
		else if(b <= 38){fa="Blue";}
		else if(b <= 42){fa="Green";}
		else if(b <= 46){fa="Green";}
		else if(b <= 49){fa="Green";}
		else if(b <= 52){fa="Red";}
		else if(b <= 55){fa="Red";}
		else if(b <= 58){fa="Red";}
		else if(b <= 68){fa="Nightmare";}
		else if(b <= 70){fa="TanDoor";}
		else if(b <= 72){fa="BlueDoor";}
		else if(b <= 74){fa="GreenDoor";}
		else if(b <= 76){fa="RedDoor";}
			 return fa;
		}
		public String CardType(int c)
		{
			 if(c <= 1){return "Key";}
		else if(c <= 2){return "Sun";}
		else if(c <= 3){return "Moon";}
		else if(c <= 4){return "Key";}
		else if(c <= 5){return "Sun";}
		else if(c <= 6){return "Moon";} 
		else if(c <= 7){return "Key";}
		else if(c <= 8){return "Sun";}
		else if(c <= 9){return "Moon";}
		else if(c <= 10){return "Key";}
		else if(c <= 11){return "Sun";}
		else if(c <= 12){return "Moon";}
			 return null;
		}
		public void secondCard(int handCardone, int handCardTwo)
		{
				int O = 0;
				int T = 0;
				O = SimpleNumber(handCardone);
				T = SimpleNumber(handCardTwo);
				FB = CardType(O);
				SB = CardType(T);
				System.out.println("FB = " + FB + "SB = " + SB);
					 if(FB != SB)
					 {
						 Stack.add(Hand.remove(handCardone));
						 System.out.println("Ditto");
					 }
		} 
		public void isCardCorrect(int b, int c)
		{
			int topCard = 0;
			int nextCard = 0;
				topCard = SimpleNumber(HandCard);
				nextCard = SimpleNumber(b);
				System.out.println("topCard = " + topCard + "nextCard = " + nextCard);
				FA = CardColor(HandCard);
				SA = CardColor(b);
				FB = CardType(HandCard);
				SB = CardType(b);
				
				secondCard(HandCard, Stack.get(Stack.size()-1));
		}
		
		public void isCardSecond(int handCardone, int handCardTwo)
		{
				int O = 0;
				int T = 0;
				System.out.println("handCardone = "+handCardone);
				O = SimpleNumber(handCardone);
				System.out.println("handCardTwo = "+handCardTwo);
				T = SimpleNumber(handCardTwo);
				FB = CardType(O);
				SB = CardType(T);
				System.out.println(" FB = " + FB + "SB = " + SB);
					 if(FB != SB)
					 {
						 Stack.add(Hand.remove(handCardone));
						 System.out.println("Ditto");
					 }
		}
		public void isCardOnStack(int x, int y)
		{
			//if the y value of the card is above the hand and to the right of the discard pile
			if(y < bottomLineYcoord && x > cardWidth + 5)
			{
				if(Stack.size() == 0)
				{
					System.out.print(Stack.size() + "<- Should be 0");
					Stack.add(Hand.remove(HandCard));
				}
				else if(Stack.size() == 1 )
				{
					System.out.print(Stack.size() + "<- Should be 1");
					isCardSecond(HandCard, Stack.get(Stack.size()-1));
				}
				else if(Stack.size() <= 2)
				{
					System.out.print(Stack.size() + "<- Should be greater then or equal to 2");
					isCardCorrect(Stack.get(Stack.size()-1), Stack.get(Stack.size() - 2));
				}
			}
		}
		public void isCardDiscard(int x, int y)
		{
			if(x < cardWidth + 5 && y < deckY-10 && Hand.get(HandCard) < 58)
			{
				Discard.add(Hand.remove(HandCard));
			}
		}
		
		
		public void whereIsTheCard(int x, int y)
		{	
			isCardDiscard(x, y);
			isCardOnStack(x, y);
		}
		@Override
		public void mouseReleased(MouseEvent e) 
		{
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
			
			repaint();
			
		}
		
	}
}
