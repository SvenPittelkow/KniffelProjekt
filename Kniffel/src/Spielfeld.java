import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Spielfeld implements ActionListener {
	
	static int breite = 800, höhe = 600;
	static JFrame frame;
	static JPanel panel;
	static JLabel label;
	static JTable table;
	static JButton button;

	public void actionPerformed(ActionEvent play) {
		if (play.getSource() == VerwaltungNamen.button) {
			frame();
		}
	}

	private void frame() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(Spielfeld.breite, Spielfeld.höhe);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Yatzy-Game");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel();
		label.setText("Ein Fenster ....... :D");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(200, 100, 200, 40);
				
		frame.add(panel);
		panel.add(label);
		
		
		
		
	}

}
