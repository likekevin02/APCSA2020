package starfighter2;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s) {
		super(x, y, 20, 5);
		speed = s;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.cyan);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void move(String direction) {

		if (direction.equals("UP"))
			setY(getY() - getSpeed());
		if (direction.equals("DOWN"))
			setY(getY() + getSpeed());
		if (direction.equals("LEFT"))
			setX(getX() - getSpeed());
		if (direction.equals("RIGHT"))
			setX(getX() + getSpeed());
	}

	public boolean hitAlien(Object o) {
		Alien a = (Alien) o;

		if (this.getX() + this.getWidth() > a.getX() && this.getX() < a.getX() + a.getWidth()) {
			if (this.getY() < a.getY() + a.getHeight() && this.getY() + this.getHeight() > a.getY()) {
				return true;
			}
		}

		return false;
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}