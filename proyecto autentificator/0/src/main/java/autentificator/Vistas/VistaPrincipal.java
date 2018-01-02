package autentificator.Vistas;

import java.awt.*;
import javax.swing.*;

public class VistaPrincipal extends JFrame {

	public VistaPrincipal() throws HeadlessException {
		// Ventana
		super("Ventana Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Layout
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4,2);
        gl.setHgap(2);
        cp.setLayout(new FlowLayout());
        
        
        JLabel etiqueta = new JLabel("Usuario: ");
        GridBagConstraints gU1 = new GridBagConstraints();
        gU1.gridx=0;
        gU1.gridy=0;
        getContentPane().add(etiqueta,gU1);
        
        
        JTextField texto = new JTextField(10);
        GridBagConstraints gU2 = new GridBagConstraints();
        gU2.gridx=1;
        gU2.gridy=0;
        getContentPane().add(texto,gU2);
        
  
        
        JLabel etiqueta2 = new JLabel("Contraseña: ");
        GridBagConstraints gc1 = new GridBagConstraints();
        gc1.gridx=0;
        gc1.gridy=1;
        getContentPane().add(etiqueta2,gc1);
        
        JPasswordField pass= new JPasswordField(10);
        GridBagConstraints gc2 = new GridBagConstraints();
        gc2.gridx=1;
        gc2.gridy=1;
        getContentPane().add(pass,gU2);
        
        
        
      
        
        JButton ok =new JButton("Acceder");
        GridBagConstraints gac = new GridBagConstraints();
        gac.gridx=2;
        gac.gridy=4;
        getContentPane().add(ok,gac);
        
        JButton reg =new JButton("Registro");
        GridBagConstraints greg = new GridBagConstraints();
        greg.gridx=0;
        greg.gridy=4;
        getContentPane().add(reg,greg);

	}

	public VistaPrincipal(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public VistaPrincipal(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public VistaPrincipal(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
