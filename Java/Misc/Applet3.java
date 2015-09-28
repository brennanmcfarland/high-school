import java.awt.*;

public class Applet3 extends java.applet.Applet
{
	font f = new Font ("TimesRoman",Font.BOLD,24);
	String whatToSay;
	
	public void init()
	{
		setBackground(Color.blue);
		this.whatToSay = getParameter("whatToSay");
		if(this.whatToSay == "null")
			this.whatToSay = "Hello, World!";
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.setColor(Color.red);
		g.DrawString(this.whatToSay, 100, 25);
	}
}