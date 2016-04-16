import java.awt.*;
import java.applet.Applet;

public class Ovals extends Applet {
	
	public void paint(Graphics g){
		int left = 5;
		int top = 5;
		int width = this.getWidth()/2-10;
		int height = this.getHeight()-10;
		drawOvals(g, left, top, width, height);
	}
	
	public void drawOvals(Graphics g, int l, int t, int w, int h){
		while (h>0){
			g.drawOval(l, t, w, h);
			l += 10;
			t += 10;
			w -= 20;
			h -= 20;
		}
	}
}
