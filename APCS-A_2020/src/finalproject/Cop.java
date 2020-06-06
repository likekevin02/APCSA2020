package finalproject;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Cop extends MovingThing {
	private int speed;
	private Image image;

	// Constructors
	public Cop() {
		this(0, 0, 40, 70, 0);
	}

	public Cop(int x, int y, int s) {
		this(x, y, 40, 70, s);
	}

	public Cop(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("policecar.png");
			image = ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("Image error");
		}
	}

	// setters and getters

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
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

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);

	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}