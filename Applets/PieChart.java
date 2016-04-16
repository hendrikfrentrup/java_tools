import java.awt.*;
import java.applet.Applet;

public class PieChart extends Applet {
	int sectionSizes[] = {60, 150, 30, 45, 75};
	Color sectionColors[] = {Color.blue, Color.red, Color.cyan, Color.green, Color.yellow};
	public void paint(Graphics g){
		drawPieChart(g, 50, 20, 200, 200, 90, sectionSizes, sectionColors);
	}
	public void drawPieChart(Graphics g, int l, int t, int w, int h, int start, int sizes[], Color colors[]){
		for (int i = 0; i < sizes.length; i++){
			g.setColor(colors[i]);
			g.fillArc(l, t, w, h, start, sizes[i]);
			start += sizes[i];
		}
	}
}