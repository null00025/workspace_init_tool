package panel.menu;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class PanelCenter extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelCenter() {

//		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
//		add(rdbtnmntmNewRadioItem);
//		JRadioButton radioBtn1 = new JRadioButton("Javaインストール");
//		rdbtnmntmNewRadioItem.add(radioBtn1);
//		JRadioButton radioBtn2 = new JRadioButton("Eclipseインストール");
//		rdbtnmntmNewRadioItem.add(radioBtn2);

		GridLayout layout = new GridLayout(5,1);

		JRadioButton radio5 = new JRadioButton("Peach");
	    JRadioButton radio6 = new JRadioButton("Apple");
	    JRadioButton radio7 = new JRadioButton("Orange");
	    JRadioButton radio8 = new JRadioButton("Grape");

	    ButtonGroup group = new ButtonGroup();
	    group.add(radio5);
	    group.add(radio6);
	    group.add(radio7);
	    group.add(radio8);

	    setLayout(layout);
	    add(radio5);
	    add(radio6);
	    add(radio7);
	    add(radio8);


//		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
//		add(rdbtnNewRadioButton);

	}

}
