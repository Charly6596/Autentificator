package generator.vista;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public abstract class frameBase extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public frameBase() {
		Toolkit pantalla = Toolkit.getDefaultToolkit(); //Coge los datos de la pantalla
	    Dimension pantallaD = pantalla.getScreenSize(); //Coge la resolución y la divide en 2 variables
	    int width = pantallaD.width;
	    int height = pantallaD.height;
	    Dimension tamano = new Dimension(width/4, height/4);
	    //Dimension tamano = new Dimension(640, 1171);
	    this.setSize(tamano); 
	    setPreferredSize(tamano); //El tamaño de la ventana es 1/4 de la resolución
	    setLocationRelativeTo(null); //Pone la ventana en el centro
	    setResizable(false); //No cambiar el tamaño de la ventana
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
