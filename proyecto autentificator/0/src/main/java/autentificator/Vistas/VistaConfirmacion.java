package autentificator.Vistas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import generator.vista.frameBase;

public class VistaConfirmacion extends frameBase {

	public VistaConfirmacion() {
		
		// Ventana
		super();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Layout
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4,2);
        gl.setHgap(2);
        cp.setLayout(new FlowLayout());
		
        JLabel etiqueta = new JLabel("Se ha accedido correctamente");
        GridBagConstraints gU1 = new GridBagConstraints();
        gU1.gridx=0;
        gU1.gridy=0;
        cp.add(etiqueta,gU1);
		
		
	}

}
