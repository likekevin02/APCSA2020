package finalproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.lang.reflect.Array;

import javax.imageio.ImageIO;

import starfighter.Alien;

import java.util.ArrayList;
import java.util.List;

public class CopSquad {
	private List<Cop> cops;
	private int maxSize;

	public CopSquad(int size) {
		cops = new ArrayList<Cop>();
		maxSize = size;
		for (int i = 0; i < size; i++) {
			this.addrandom();
			for (int j = i; j > 0; j--) {
				if (cops.get(j).getX() - cops.get(i).getX() < 60 || cops.get(j).getY() - cops.get(i).getY() < 90) {
					int yc = (int) (Math.random() * 900);
					int xc = (int) (Math.random() * 360);
					cops.get(j).setY(yc-900);
					cops.get(j).setX(xc);
				}
			}

		}
	}

	public List<Cop> getCops() {
		return cops;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setCops(List<Cop> cops) {
		this.cops = cops;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public void add(Cop al) {
		cops.add(al);
	}

	public void addrandom() {
		int xc = (int) (Math.random() * 360);
		int yc = (int) (Math.random() * 900);
		cops.add(new Cop(xc, yc - 1100, 1));
	}

	public void drawEmAll(Graphics window) {
		for (Cop a : cops) {
			a.draw(window);
		}
	}

	public void moveEmAll() {
		for (Cop a : cops) {
			a.move("DOWN");
			if (a.getY() > 901) {
				int yc = (int) (Math.random() * 900);
				int xc = (int) (Math.random() * 360);
				a.setY(yc - 900);
				a.setX(xc);
			}
		}
	}

	public String toString() {
		return "";
	}

}