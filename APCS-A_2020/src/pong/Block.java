package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		setColor(Color.black);
		setPos(100, 150);
		setWidth(10);
		setHeight(10);
	}

	public Block(int x, int y) {
		setColor(Color.orange);
		setPos(x, y);
		setWidth(10);
		setHeight(10);
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h) {
		setColor(Color.black);
		setPos(x, y);
		setWidth(w);
		setHeight(h);
	}

	public Block(int x, int y, int w, int h, Color c) {
		setPos(x, y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}

	// add the other set methods

	@Override
	public void setPos(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public void setX(int x) {
		this.xPos = x;
	}

	@Override
	public void setY(int y) {
		this.yPos = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(Color col) {
		this.color = col;
	}

	// add the other get methods

	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color c) {
		window.setColor(c);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block testBlock = (Block) obj;
		if (this.getColor().equals(testBlock.getColor()) && this.getWidth() == testBlock.getWidth()
				&& this.getHeight() == testBlock.getHeight())
			return true;
		else
			return false;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color;
	}

}