package com.MazeGame;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;

public class Game implements MouseListener {

	JFrame frame;
	JPanel panel;
	ImageIcon img;
	JLabel label, label_2;
	Dimension dimension;
	String maze[] = {
			"img/maze1.png",
			"img/maze2.png",
			"img/maze3.png",
			"img/maze4.png",
			"img/maze5.png",
			"img/maze6.png",
			"img/maze7.png",
			"img/maze8.png",
			"img/maze9.png",
			"img/maze10.png",
			"img/maze11.png",
			"img/maze12.png",
			"img/maze13.png",
			"img/maze14.png",
			"img/maze15.png",
	};
	

	Game(int maze_no) {

		frame = new JFrame();
		panel = new JPanel();
		img = new ImageIcon(maze[maze_no]);
		label = new JLabel();
		label_2 = new JLabel();
		
		dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Image image = img.getImage();
		Image tempimage = image.getScaledInstance(800, 850, java.awt.Image.SCALE_DEFAULT);
		img = new ImageIcon(tempimage);
		label.setIcon(img);
		
		label.setLayout(null);
		panel.setLayout(null);
		frame.setLayout(null);
		frame.setUndecorated(true);
		

		
		frame.setBounds(0, 0, 800, 850);
		
		panel.setBounds(frame.getBounds());
		label.setBounds(panel.getBounds());

		label.setVerticalAlignment(label.CENTER);
		label.setHorizontalAlignment(label.CENTER);
		
		label.setBackground(new Color(0, 0, 0, 0));
		panel.setBackground(new Color(0, 0, 0, 0));
		frame.setBackground(new Color(0, 0, 0, 0));
		
		label.setIcon(img);
		panel.add(label);
		frame.add(panel);
		frame.setLocation((int)(dimension.width / 2 - frame.getSize().getWidth() / 2), (int)(dimension.height / 2 - frame.getSize().getHeight() / 2));

		label.addMouseListener(this);
		
		label.setVisible(true);
		panel.setVisible(true);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		new Game(0);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("entered");
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("C:\\Users\\Navneet\\Downloads\\tick.png");
		Cursor a = toolkit.createCustomCursor(image, new Point(16, 16), "");
		label.setCursor(a);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
