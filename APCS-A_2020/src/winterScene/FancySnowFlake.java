package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape
{

	public FancySnowFlake(int x, int y, int w, int h, Color col, int xSpd, int ySpd) {
		super(x, y, w, h, col, xSpd, ySpd);
	}

	@Override
	public void draw(Graphics window) {
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		int [] xPoints = {x+2, x+w*3/4, x+w/2, x+w*2/5, x+w, x+w*3/7, x+w/2, x+w*6/15, x+1};
		int [] yPoints = {y+h/2, y+h*1/2, y, y+h*6/7, y+h/6, y+h*9/10, y+h, y+h*4/5, y+h/2};
		
		window.setColor(getColor());
		window.drawPolyline(xPoints, yPoints, xPoints.length);
	}
	
	public void draw(Graphics window, Color c) {
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		int [] xPoints = {x+2, x+w*3/4, x+w/2, x+w*2/5, x+w, x+w*3/7, x+w/2, x+w*6/15, x+1};
		int [] yPoints = {y+h/2, y+h*1/2, y, y+h*6/7, y+h/6, y+h*9/10, y+h, y+h*4/5, y+h/2};
		
		window.setColor(c);
		window.drawPolyline(xPoints, yPoints, xPoints.length);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		draw(window, Color.blue);
		
		setXPos(getXPos() + getXSpeed());
		setYPos(getYPos() + getYSpeed());
		
		window.setColor(getColor());
		draw(window);
	}
	
}