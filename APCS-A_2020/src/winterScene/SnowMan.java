package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 
	  window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
	  window.fillOval(getXPos()+25, getYPos()-getHeight()/2, getWidth()-50, getHeight()-50);
	  window.fillOval(getXPos()+50, getYPos()-(getHeight()-25), getWidth()-100, getHeight()-100);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}