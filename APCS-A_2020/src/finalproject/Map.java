package finalproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Map extends Canvas implements KeyListener, Runnable {
	private Player player;
	private CopSquad squad;
	private boolean gameOver = false;
	private boolean[] keys;
	private BufferedImage back;
	private int score;

	public Map() {
		setBackground(Color.GRAY);

		keys = new boolean[5];
		player = new Player(180, 500, 40, 70, 3);
		squad = new CopSquad(7);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {

		Graphics2D twoDGraph = (Graphics2D) window;

		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.GRAY);
		graphToBack.fillRect(0, 0, 400, 900);
		graphToBack.setColor(Color.YELLOW);
		graphToBack.fillRect(180, -10, 20, 90);
		graphToBack.fillRect(180, 130, 20, 90);
		graphToBack.fillRect(180, 270, 20, 90);
		graphToBack.fillRect(180, 410, 20, 90);
		graphToBack.fillRect(180, 550, 20, 90);
		graphToBack.fillRect(180, 690, 20, 90);
		graphToBack.fillRect(180, 830, 20, 90);
		graphToBack.fillRect(180, 970, 20, 90);
		graphToBack.setColor(Color.BLUE);
		graphToBack.setFont(new java.awt.Font("Times New Roman", 1, 20));
		graphToBack.drawString("Score: " + score, 10, 50);
		squad.drawEmAll(graphToBack);
		player.draw(graphToBack);

		if (keys[0] == true) {
			player.move("LEFT");
			for (Cop a : squad.getCops()) {
				a.move("RIGHT");
			}
		}
		if (keys[1] == true) {
			player.move("RIGHT");
			for (Cop a : squad.getCops()) {
				a.move("LEFT");
			}
		}

		squad.moveEmAll();

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}

	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}

	}

	public void startGame() {
		setVisible(true);
		new Thread(this).start();

	}

	public void run() {
		try {
			while (gameOver == false) {
				Thread.currentThread().sleep(9);
				repaint();

				for (Cop a : squad.getCops()) {
					if (player.crashed(a)) {
						System.out.println("GAME OVER");
						repaint();
						gameOver = true;
					}
				}

				int count = 0;
				for (Cop a : squad.getCops()) {
					if (a.getY() == 500) {
						count += 1;
					}
				}
				score += count;

				if (score > 15) {
					for (Cop a : squad.getCops()) {
						a.setSpeed(3);
					}
				}

				if (score > 30) {
					for (Cop a : squad.getCops()) {
						a.setSpeed(5);
					}
				}

				if (score > 50) {
					for (Cop a : squad.getCops()) {
						a.setSpeed(7);
					}
				}

				if (score > 70) {
					for (Cop a : squad.getCops()) {
						a.setSpeed(10);
					}
				}
			}
		} catch (Exception e) {
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}