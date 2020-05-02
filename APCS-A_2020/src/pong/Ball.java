package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable{
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super();
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 4;
		ySpeed = 2;
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		setxSpeed(4);
		setySpeed(2);
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		setxSpeed(4);
		setySpeed(2);
	}

	public Ball(int x, int y, int w, int h, int xSpd, int ySpd) {
		super(x, y, w, h);
		setxSpeed(xSpd);
		setySpeed(ySpd);
	}

	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd) {
		super(x, y, w, h, c);
		setxSpeed(xSpd);
		setySpeed(ySpd);
	}

	// add the set methods
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	// add the get methods
	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		super.draw(window, Color.white);

		// move the ball
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);

		// draw the ball at its new location
		super.draw(window);
	}

	public boolean equals(Object obj) {
		Ball other = (Ball) obj;
		if (super.equals(obj) && this.getxSpeed() == other.getxSpeed() && this.getySpeed() == other.getySpeed())
			return true;
		else
			return false;
	}

	public int getVerticalDistFromCenter(Object obj) {
		Block test = (Block) obj;
		return (this.getY() + (this.getHeight() / 2)) - (test.getY() + (test.getHeight() / 2));
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Block test = (Block) obj;
		if (this.getxSpeed() < 0) {
			if (this.getX() <= test.getX() + test.getWidth() + Math.abs(this.getxSpeed())
					&& this.getX() >= test.getX()) {
				if (this.getY() + this.getHeight() >= test.getY() && this.getY() <= test.getY() + test.getHeight()) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Block test = (Block) obj;
		if (this.getxSpeed() > 0) {
			if (this.getX() + this.getWidth() >= test.getX() - Math.abs(this.getxSpeed())
					&& this.getX() + this.getWidth() <= test.getX() + test.getWidth()) {
				if (this.getY() + this.getHeight() >= test.getY() && this.getY() <= test.getY() + test.getHeight()) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Block test = (Block) obj;
		if (this.getY() <= test.getY() + test.getHeight() + Math.abs(this.getySpeed())) {
			if (this.getX() <= test.getX() + test.getWidth() && this.getX() + this.getWidth() >= test.getX()) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Block test = (Block) obj;

		if (this.getY() + this.getHeight() >= test.getY() - Math.abs(this.getySpeed())) {
			if (this.getX() <= test.getX() + test.getWidth() && this.getX() + this.getWidth() >= test.getX()) {
				return true;
			}
		}

		return false;
	}

	// add a toString() method
	public String toString() {
		return super.toString() + ", " + xSpeed + ", " + ySpeed;
	}
}