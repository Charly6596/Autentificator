package generator.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class frame1 extends frameBase {
	private JPanel panel;
	private JButton acceder;
	public frame1() {
		this.panel = new JPanel(new BorderLayout(0, 0));
		this.acceder = new JButton("Acceder");
		acceder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.updateUI();
				
			}
		});
		panel.add(acceder, BorderLayout.CENTER);
		this.add(panel);
		setVisible(true);
	}
}
