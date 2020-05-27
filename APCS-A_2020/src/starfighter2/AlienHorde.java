package starfighter2;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private List<Alien> aliens;
	private int maxSize;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		maxSize = size;
		for (int i = 0; i < size; i++) {
			int x = 650 + (i % 2) * 70;
			int y = 400 + (i / 2) * 50;
			aliens.add(new Alien(x, y, 1));
		}
	}

	public List<Alien> getAliens() {
		return aliens;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setAliens(List<Alien> aliens) {
		this.aliens = aliens;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void drawEmAll(Graphics window) {
		for (Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll() {
		for (Alien a : aliens) {
			if (a.getY() > 500 || a.getY() < 10) {
				a.setX(a.getX() - (maxSize / 10) * 50);
				a.setSpeed(-a.getSpeed());
				a.move("DOWN");
			} else
				a.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		// need to continue outer because there is an index out of bounds error when you
		// hit 0th alien and more than 1 bullet on screen
		outer: for (int a = 0; a < aliens.size(); a++) {
			for (int b = 0; b < shots.size(); b++) {
				if (shots.get(b).hitAlien(aliens.get(a))) {
					aliens.remove(a);
					shots.remove(b);
					b--;
					a--;
					continue outer;
				}
			}
		}
	}

	public String toString() {
		return "";
	}

}