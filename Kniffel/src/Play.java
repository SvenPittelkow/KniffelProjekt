import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Play implements ActionListener {

	static int breite = 800, höhe = 600;
	static JFrame frame;
	static JLabel label;
	static JPanel panel;
	static JButton button;

	@Override
	public void actionPerformed(ActionEvent play) {

		if (play.getSource() == Play.button) {
			frame();
			System.exit(0);
		}
	}

	private static void frame() {

		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(Play.breite, Play.höhe);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Yatzy-Game");
	
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setLayout(null);

		button = new JButton();
		button.setText("Let´s Play");
		button.setSize(200, 50);
		button.setFont(new Font("Arial", Font.BOLD, 30));
		button.setBounds(300, 230, 200, 50);
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
		panel.add(button); // Hinzufügen des Buttons ins Fenster
		
		button.addActionListener(new AuswahlAnzSpieler());
	}
}
