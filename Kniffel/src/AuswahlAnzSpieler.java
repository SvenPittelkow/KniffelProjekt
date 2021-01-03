import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class AuswahlAnzSpieler implements ActionListener {

	static int breite = 800, höhe = 600;
	static JFrame frame;
	static JPanel panel;
	static JLabel label;
	static JComboBox<String> cb;
	static JButton button;

	public void actionPerformed(ActionEvent play) {
		if (play.getSource() == Play.button) {
			frame();
			Play.frame.dispose();
		}
	}

	public void frame() {

		frame = new JFrame(); // Fenster zum Auswählen der Spieleranzahl
		frame.setVisible(true); // setVisible(true) = Wird sichtbar
		frame.setSize(AuswahlAnzSpieler.breite, AuswahlAnzSpieler.höhe);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Yatzy-Game");
		frame.setLocationRelativeTo(null); // setLocationRelativeTo(null) = Fenster erscheint in der
											// Mitte des Bildschirms

		panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setLayout(null);

		label = new JLabel();
		label.setText("Wählen Sie die Anzahl der Spieler aus");
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(125, 70, 600, 50);
		
		String[] Spieler = {"2","3","4","5","6","7","8"}; // Wird die Auswahl gespeichert???? 
		cb = new JComboBox<String>(Spieler);
		cb.setBounds(350, 150, 75, 50);

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
		panel.add(cb);
		panel.add(button); // Hinzufügen des Buttons ins Fenster
		button.addActionListener(new VerwaltungNamen());

	}
}
