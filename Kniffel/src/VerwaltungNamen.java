import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class VerwaltungNamen implements ActionListener {

	static int breite = 800, höhe = 600;
	static JFrame frame;
	static JPanel panel;
	static JLabel label;
	static JButton button;

	@Override
	public void actionPerformed(ActionEvent play) {
		if (play.getSource() == AuswahlAnzSpieler.button) {
			frame();
		}
	}

	private void frame() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(VerwaltungNamen.breite, VerwaltungNamen.höhe);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Yatzy-Game - Namensverwaltung");
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel();
		label.setText("Bitte geben Sie die Namen der Spieler ein");
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(110, 70, 620, 50);
		
// Anzahl der Spieler muss übernommen werden
// Namen der jeweiligen Spieler kann man eintragen
		
		button = new JButton();
		button.setText("Bestätigen"); // Text Button
		button.setSize(200, 50); // Größe Button
		button.setFont(new Font("Arial", Font.BOLD, 30)); // Schriftart Button
		button.setBounds(285, 300, 200, 50); // Position Button
		button.setForeground(Color.BLACK);
		button.setBackground(Color.LIGHT_GRAY);

		button.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent evt) { // wenn Maus auf Button
				button.setForeground(Color.WHITE);
				button.setBackground(Color.GREEN);
			}

			public void mouseExited(MouseEvent evt) { // wenn Maus nicht auf Button
				button.setForeground(Color.BLACK);
				button.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		button.addActionListener(new Spielfeld());
	}
}
