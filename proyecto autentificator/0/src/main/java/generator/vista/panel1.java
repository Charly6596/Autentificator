package generator.vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import generator.logica.logicaThreadServidor;

public class panel1 extends JPanel {
	JLabel textobienvenida;
	JButton acceder;
	JLabel textocodigo;
	JButton volver;
	JButton nuevocodigo;
	JPanel panel2;
	public panel1() {
		this.setLayout(new FlowLayout());
		inicializarComponentes();
		anadirComponentes1();
		this.add(panel2);
	}
	private void anadirComponentes2() {
		panel2.add(textocodigo);
		panel2.add(nuevocodigo);
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
		this.nuevocodigo = new JButton("Otro código");

		final logicaThreadServidor logica = new logicaThreadServidor();

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		ActionListener al1, al2;
		volver.addActionListener(al2 = new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				panel2.removeAll();
				anadirComponentes1();
				panel2.updateUI();
				
			}
		});
		
		acceder.addActionListener(al1 = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Thread(logica).start();
				panel2.removeAll();
				anadirComponentes2();
				panel2.updateUI();
				
			}
		});
		nuevocodigo.addActionListener(al1);
	}
	
}
