package generator.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frame1 extends frameBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private panel1 panel;
	public frame1() {
		this.panel = new panel1();
		this.add(panel);
		setVisible(true);
	}
}
