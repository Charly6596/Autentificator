package autentificator.Logica;

import javax.swing.SwingUtilities;

import autentificator.Vistas.VistaPrincipal;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaPrincipal v = new VistaPrincipal();
		
	    SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new autentificator.Vistas.VistaPrincipal().setVisible(true);
            	
            }
        });		
	}

}
