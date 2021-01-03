import java.awt.Color; //von sven 2.
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class gui {

	public gui() {
// Klasse Play (Doppelt gecodet wusste mir nicht anders zu helfen) 
		Play.frame = new JFrame();
		Play.frame.setVisible(true);
		Play.frame.setSize(Play.breite, Play.höhe);
		Play.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Play.frame.setTitle("Yatzy-Game");
		Play.frame.setResizable(false);
		Play.frame.setLocationRelativeTo(null);

		Play.panel = new JPanel();
		Play.panel.setBackground(Color.GREEN);
		Play.panel.setLayout(null);

		Play.button = new JButton();
		Play.button.setText("Let´s Play");
		Play.button.setSize(200, 50);
		Play.button.setFont(new Font("Arial", Font.BOLD, 30));
		Play.button.setBounds(300, 250, 200, 50);
		Play.button.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent evt) { // wenn Maus auf Button
				Play.button.setForeground(Color.WHITE);
				Play.button.setBackground(Color.GREEN);
			}

			public void mouseExited(MouseEvent evt) { // wenn Maus nicht auf Button
				Play.button.setForeground(Color.BLACK);
				Play.button.setBackground(Color.LIGHT_GRAY);
			}
		});

		Play.frame.add(Play.panel);
		Play.panel.add(Play.button); // Hinzufügen des Buttons ins Fenster
		Play.button.addActionListener(new AuswahlAnzSpieler());

	}

}
