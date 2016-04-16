import java.awt.*;
import java.applet.Applet;

public class Arcs extends Applet{
	public void paint(Graphics g){
		g.drawArc(50, 50, 100, 100, 90, 270);
		g.setColor(Color.black);
		g.fillArc(200, 50, 100, 100, 0 , -270);
	}
}
