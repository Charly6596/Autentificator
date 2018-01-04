package autentificator.Vistas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import generator.vista.frameBase;

public class VistaRegistro extends frameBase {

	public VistaRegistro() {
		// Ventana
		super();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Layout
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4,2);
        gl.setHgap(2);
        cp.setLayout(new FlowLayout());
        
        //Formulario de registro
        JLabel etiqueta = new JLabel("Usuario: ");
        GridBagConstraints gU1 = new GridBagConstraints();
        gU1.gridx=0;
        gU1.gridy=0;
        cp.add(etiqueta,gU1);
        
        
        final JTextField texto = new JTextField(10);
        GridBagConstraints gU2 = new GridBagConstraints();
        gU2.gridx=1;
        gU2.gridy=0;
        cp.add(texto,gU2);
        
  
        
        JLabel etiqueta2 = new JLabel("Contraseña: ");
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.gridx=0;
        gc1.gridy=1;
        cp.add(etiqueta2,gc1);
        
        final JPasswordField pass= new JPasswordField(10);
        GridBagConstraints gc2 = new GridBagConstraints();
        gc2.gridx=1;
        gc2.gridy=1;
        cp.add(pass,gU2);
        
        
        JLabel etiqueta3 = new JLabel("Apellidos: ");
        GridBagConstraints ga1 = new GridBagConstraints();
        gU1.gridx=0;
        gU1.gridy=0;
        cp.add(etiqueta3,ga1);
        
        
        final JTextField apellidos = new JTextField(10);
        GridBagConstraints ga2 = new GridBagConstraints();
        gU2.gridx=1;
        gU2.gridy=0;
        cp.add(apellidos,ga2);
        
        
        JLabel etiqueta4 = new JLabel("Correo: ");
        GridBagConstraints gco1 = new GridBagConstraints();
        gU1.gridx=0;
        gU1.gridy=0;
        cp.add(etiqueta4,gco1);
        
        
        final JTextField correo = new JTextField(10);
        GridBagConstraints gco2 = new GridBagConstraints();
        gU2.gridx=1;
        gU2.gridy=0;
        cp.add(correo,gco2);
      
        //boton
        JButton ok =new JButton("Acceder");
        GridBagConstraints gac = new GridBagConstraints();
        gac.gridx=2;
        gac.gridy=4;
        cp.add(ok,gac);
	}

}
