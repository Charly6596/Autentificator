package autentificator.Vistas;

import generator.vista.frameBase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.swing.*;

import Usuarios.Helper_db_Usuario;

public class VistaPrincipal extends frameBase {

	public VistaPrincipal() throws HeadlessException {
		// Ventana
		super();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Layout
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4,2);
        gl.setHgap(2);
        cp.setLayout(new FlowLayout());
        
        //login
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
        
        
        
      
        //botones
        JButton ok =new JButton("Acceder");
        GridBagConstraints gac = new GridBagConstraints();
        gac.gridx=2;
        gac.gridy=4;
        cp.add(ok,gac);
        
        JButton reg =new JButton("Registro");
        GridBagConstraints greg = new GridBagConstraints();
        greg.gridx=0;
        greg.gridy=4;
        cp.add(reg,greg);
        
   
        

    	
    	ActionListener action = new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			
    			//recojer datos
				String correo = texto.getText();
				
				char[] arrayC = pass.getPassword();
				String pas = new String(arrayC);
				//encriptar pass
				String password=null;
			
				try {
					password = LogicaComun.Encriptacion.encripta(pas);
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					System.out.println("Error al encriptar");
				}
				
    			
    		
    			try {
					if(Helper_db_Usuario.login(correo, password)){
					
					//ComprobarLogin
					
						new autentificator.Vistas.VistaCodigo().setVisible(true);;
						setVisible(false);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    			
    		}
    		
    	};
    	ok.addActionListener(action);
        
        
     
        

	}

	public VistaPrincipal(GraphicsConfiguration arg0) {
		super();
		// TODO Auto-generated constructor stub
	}

	public VistaPrincipal(String arg0) throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public VistaPrincipal(String arg0, GraphicsConfiguration arg1) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
