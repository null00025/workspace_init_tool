package panel.menu;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelNorth extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelNorth() {

		JLabel lblTitle = new JLabel("初期設定メニュー");
		lblTitle.setFont(new Font("MS UI Gothic", Font.PLAIN, 24));
		add(lblTitle);

	}

}
