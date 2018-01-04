package generator.logica;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import conexionSocket.Servidor;

public class logicaThreadServidor implements Runnable{
	
	private void execute() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
	    Future<String> future = null;
	    Servidor server = null;
		try {
			future = executor.submit(server = new Servidor());
			try {
		        System.out.println("Started..");
		        try {
					System.out.println(future.get(20, TimeUnit.SECONDS));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.println("Finished!");
		    } catch (TimeoutException e) {
		        future.cancel(true);
		        System.out.println("Terminated!");
		    }
		    
		    ServerSocket ss = server.getSS();
		    if(!ss.isClosed())
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    executor.shutdownNow();
		}catch(java.net.BindException e1){
			System.out.println("Ya hay un código generado");
			
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	    
	}

	public void run() {
		execute();
		
	}
	
}
