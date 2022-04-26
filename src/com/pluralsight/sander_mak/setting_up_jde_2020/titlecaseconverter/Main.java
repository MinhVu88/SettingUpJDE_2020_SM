package com.pluralsight.sander_mak.setting_up_jde_2020.titlecaseconverter;

import javax.swing.*;
import java.awt.*;

public class Main {
	private static JFrame createGUI() {
		JTextField input = new JTextField();
		input.setPreferredSize(new Dimension(300, 40));

		JButton convertBtn = new JButton("Convert");

		JLabel output = new JLabel();
		output.setPreferredSize(new Dimension(300, 40));

		convertBtn.addActionListener(event -> {
			output.setText(TitlecaseConverter.convert(input.getText()));
		});

		JFrame gui = new JFrame();
		gui.setLayout(new FlowLayout());
		gui.add(input);
		gui.add(convertBtn);
		gui.add(output);
		gui.pack();
		gui.setLocationRelativeTo(null);

		return gui;
	}

	public static void main(String[] args) {
		JFrame app = createGUI();
		app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
