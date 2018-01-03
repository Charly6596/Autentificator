package autentificator.Vistas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import generator.vista.frameBase;

public class VistaCodigo extends frameBase {

	public VistaCodigo() {
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
		        JLabel etiqueta = new JLabel("Codigo");
		        GridBagConstraints gU1 = new GridBagConstraints();
		        gU1.gridx=0;
		        gU1.gridy=0;
		        cp.add(etiqueta,gU1);
		        
		        
		        JTextField texto = new JTextField(10);
		        GridBagConstraints gU2 = new GridBagConstraints();
		        gU2.gridx=0;
		        gU2.gridy=1;
		        cp.add(texto,gU2);
		        
		      
		        JButton ok =new JButton("Comprobar");
		        GridBagConstraints gac = new GridBagConstraints();
		        gac.gridx=2;
		        gac.gridy=4;
		        cp.add(ok,gac);
		        
		        
		        
		        
		    	
		    	ActionListener action = new ActionListener() {
		    		
		    		public void actionPerformed(ActionEvent e) {
		    			
		    			
		    			//ComprobarCodigo
		    			
		    			new autentificator.Vistas.VistaConfirmacion().setVisible(true);;
		    			setVisible(false);

		    			
		    		}
		    		
		    	};
		    	ok.addActionListener(action);
		        
		        
		        
		        
		        
		}

}
