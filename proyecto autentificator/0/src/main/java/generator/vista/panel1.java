package generator.vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel1 extends JPanel {
	JLabel textobienvenida;
	JButton acceder;
	JLabel textocodigo;
	JButton volver;
	JPanel panel2;
	public panel1() {
		this.setLayout(new FlowLayout());
		inicializarComponentes();
		anadirComponentes1();
		this.add(panel2);
	}
	private void anadirComponentes2() {
		panel2.add(textocodigo);
		panel2.add(volver);
	}
	private void anadirComponentes1() {
		panel2.add(textobienvenida);
		panel2.add(acceder);
	}
	private void inicializarComponentes() {
		this.textobienvenida = new JLabel("Pulse acceder para generar la clave");
		this.acceder = new JButton("Acceder1");
		this.textocodigo = new JLabel("Código: 934bAk2");
		this.volver = new JButton("volver");
		this.panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		volver.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				panel2.removeAll();
				anadirComponentes1();
				panel2.updateUI();
				
			}
		});
		acceder.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				anadirComponentes2();
				panel2.updateUI();
				
			}
		});
	}
	
}
