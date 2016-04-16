import java.awt.*;
import java.applet.Applet;

public class Polygons extends Applet {
	public void paint(Graphics g){
		double hazard1, hazard2;
		int totalPoints = 75;
		int xPoints[] = new int[totalPoints]; 
		int yPoints[] = new int[totalPoints];
		
		
		for(int i = 0; i < totalPoints; i++){
			hazard1 = 400*Math.random();
			hazard2 = 400*Math.random();
			xPoints[i]= (int) hazard1;
			yPoints[i]= (int) hazard2;
		}
		g.drawPolygon(xPoints, yPoints, totalPoints);	
		
		/*int totalPoints = 3;
		int xPoints1[] = {200, 400, 0};
		int xPoints2[] = {200, 400, 0};
		int yPoints1[] = {50, 450, 450};
		int yPoints2[] = {550, 150, 150};
		
		g.drawPolygon(xPoints1, yPoints1, totalPoints);		
		g.drawPolygon(xPoints2, yPoints2, totalPoints);
		*/
	}
}
