package br.com.cod3r.decorator.swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class Client {

	public static void main(String[] args) {
		JFrame frame =new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(400,200);  
		
		JTextArea textArea = new JTextArea(10, 30);
		final JScrollPane scrollPane = new JScrollPane(
				textArea,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		frame.add(textArea);
		frame.add(scrollPane);

		frame.setVisible(true);
	}
}
