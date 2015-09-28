import java.awt.Font;

public class Applet2 extends java.applet.Applet
{
	Font f = new Font("Impact", Font.BOLD, 24);
	
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString("This is my second Applet", 100, 25);
	}
}