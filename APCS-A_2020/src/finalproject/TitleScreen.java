package finalproject;

import javax.swing.*;

import static java.lang.Character.toUpperCase;

import java.awt.*;
import java.awt.event.*;

public class TitleScreen extends JPanel {
	// Constructor
	public TitleScreen() {
		setBackground(Color.GRAY);
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		JLabel title = new JLabel("Cop Chase");
		title.setAlignmentX(CENTER_ALIGNMENT);
		title.setFont(new Font("Times New Roman", Font.BOLD, 50));
		title.setForeground(Color.GREEN);

		JLabel inst = new JLabel("Instructions");
		inst.setAlignmentX(CENTER_ALIGNMENT);
		inst.setFont(new Font("Times New Roman", Font.BOLD, 25));
		inst.setForeground(Color.GREEN);

		JLabel text = new JLabel(
				"<html><p style='text-align: center'>Use the arrow keys to move and dodge the cop cars for as long as you can!</p></html>");
		text.setAlignmentX(CENTER_ALIGNMENT);
		text.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		text.setForeground(Color.GREEN);

		JLabel name = new JLabel("By: Kevin Lee");
		name.setAlignmentX(CENTER_ALIGNMENT);
		name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		name.setForeground(Color.GREEN);

		add(Box.createRigidArea(new Dimension(0, 100)));
		add(title);
		add(Box.createRigidArea(new Dimension(0, 250)));
		add(inst);
		add(text);
		add(Box.createRigidArea(new Dimension(0, 200)));
		add(name);
		setPreferredSize(new Dimension(400, 900));

	}

}
