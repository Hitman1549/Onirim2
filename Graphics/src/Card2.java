import java.awt.Color;
import java.awt.Image;

public class Card2 
{
	private int xPos, yPos, xOriginal, yOriginal;
	private Image image;
	private boolean selected, visible, movable;
	private String type, color;
	
	public Card2(int x, int y, Image img, String t, String c)
	{
		xPos = x;
		yPos = y;
//		xOriginal = xPos;
//		yOriginal = yPos;
		image = img;
		selected = false;
		visible = false;
		movable = false;
		type = t;
		color = c;
	}
	
	public Card2(Image img, String t, String c)
	{
		xPos = -200;
		yPos = 0;
//		xOriginal = xPos;
//		yOriginal = yPos;
		image = img;
		selected = false;
		visible = false;
		movable = false;
		type = t;
		color = c;
	}
	
	public int getX() {return xPos;}
	public int getY() {return yPos;}
	public Image getImage() {return image;}
	public boolean getSelected() {return selected;}
	public int getOriginalX() {return xOriginal;}
	public int getOriginalY() {return yOriginal;}
	public String getType() {return type;}
	public String getColor() {return color;}
	public boolean getVisible() {return visible;}
	public boolean getMovable() {return movable;}
	
	public void setX(int x) {xPos = x;}
	public void setY(int y) {yPos = y;}
//	public void setOriginalX(int x) {xOriginal = x;}
//	public void setOriginalY(int y) {yOriginal = y;}

	public void setSelected(boolean val) {selected = val;}
	public void setVisible(boolean val) {visible = val;}
	public void setMovable(boolean val) {movable = val;}
}