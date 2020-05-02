package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable {
	private Ball ball;
	private Ball ball2;
	private Ball ball3;
	private Ball ball4;
	private Ball ball5;

	Ball[] ballArray = new Ball[5];

	public BallTestTwo() {
		setBackground(Color.WHITE);
		setVisible(true);

		// instantiate a new Ball
		ball = new Ball();
		ballArray[0] = ball;

		// test all constructors
		ball2 = new Ball(100, 90);
		ballArray[1] = ball2;

		ball3 = new Ball(50, 50, 30, 30);
		ballArray[2] = ball3;

		ball4 = new Ball(350, 350, 15, 15, Color.RED);
		ballArray[3] = ball4;

		ball5 = new Ball(450, 50, 20, 60, Color.GREEN);
		ballArray[4] = ball5;

		// test the Ball thoroughly
		for (Ball b : ballArray) {
			System.out.println(b);
		}

		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		for (Ball ball : ballArray) {
			ball.moveAndDraw(window);
	
			if(!(ball.getX()>=10 && ball.getX()<=550))
			{
				ball.setxSpeed(-ball.getxSpeed());
			}
	
			if(!(ball.getY()>=10 && ball.getY()<=450))
			{
				ball.setySpeed(-ball.getySpeed());
			}
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(19);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}