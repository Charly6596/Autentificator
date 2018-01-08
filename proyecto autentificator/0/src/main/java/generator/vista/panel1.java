package generator.vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Usuarios.Helper_db_Usuario;
import Usuarios.Usuario;
import acceso.Helper_acceso;
import acceso.modelo_acceso;
import conexionSocket.serverVar;
import conexionSocket.serverVarEvent;
import conexionSocket.serverVarListener;
import conexionSocket.Logica.serverLogica;
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
	private void anadirComponentes3() {
		String codigo = serverVar.getCodigo();
		int idU = Integer.parseInt(codigo);
		try {			
			Usuario usuario = Helper_db_Usuario.getUsuarioByID(idU);
			StringBuilder sb = new StringBuilder("Bienvenid@ ");
			sb.append(usuario.getNombre());
			panel2.add(new JLabel(sb.toString()));
			panel2.add(volver);
		} catch (NumberFormatException | SQLException e) {
			
		}
		
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
	private void generarTextoCodigo() {
		modelo_acceso acceso = new modelo_acceso();
		StringBuilder sb = new StringBuilder("Código: ");
		sb.append(acceso.getCodigo());
		sb.append(acceso.getId_acceso());
		this.textocodigo.setText(sb.toString());
	}
	private void inicializarComponentes() {
		this.textobienvenida = new JLabel("Pulse acceder para generar la clave");
		this.acceder = new JButton("Acceder1");		
		this.textocodigo = new JLabel();
		this.volver = new JButton("volver");
		this.panel2 = new JPanel();
		this.nuevocodigo = new JButton("Otro código");
		

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		ActionListener al1, al2;
		volver.addActionListener(al2 = new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				panel2.removeAll();
				anadirComponentes1();
				panel2.updateUI();
				
			}
		});
			serverVarListener svvl = new serverVarListener() {
			
			@Override
			public void onCodigoChange(serverVarEvent ev) {
				panel2.removeAll();
				anadirComponentes3();
				panel2.updateUI();
				
			}
		};
		serverVar.listener = svvl;
		
		acceder.addActionListener(al1 = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					new serverLogica().execute();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				panel2.removeAll();
				generarTextoCodigo();
				anadirComponentes2();
				panel2.updateUI();
			}
		});
		nuevocodigo.addActionListener(al1);
	}
	
}
