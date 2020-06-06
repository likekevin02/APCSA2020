package finalproject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheGame extends JFrame {
	private static final int WIDTH = 400;
	private static final int HEIGHT = 900;
	private CardLayout cl;
	private JPanel panel;

	public TheGame() {

		cl = new CardLayout();

		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(cl);

		Map gamePanel = new Map();
		TitleScreen titlePanel = new TitleScreen();
		cardPanel.add(titlePanel, "title");
		cardPanel.add(gamePanel, "game");

		JPanel buttonPanel = new JPanel();

		JButton gameButton = new JButton("Start Game");
		buttonPanel.add(gameButton);

		gameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "game");
				gamePanel.startGame();
			}
		});

		add(cardPanel);
		add(buttonPanel, BorderLayout.PAGE_END);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);

	}

	public static void main(String args[]) {
		new TheGame();
	}
}

