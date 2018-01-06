package conexionSocket.Logica;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import conexionSocket.Server;
import conexionSocket.serverVar;
import conexionSocket.serverVarEvent;
import conexionSocket.serverVarListener;

public class serverLogica {
	ExecutorService executor = Executors.newSingleThreadExecutor();
	ScheduledExecutorService executor2 = Executors.newScheduledThreadPool(1);
    Future<String> future = null;
    Server server = null;
    public serverLogica() {
    	try {
			this.server = new Server();
		} catch (IOException e) {			
		}
    }
	public void execute() throws InterruptedException, ExecutionException, IOException {
		
	    serverListener svl = new serverListener() {
			
			@Override
			public void onRecibido(serverEvent ev) {
				serverVar.setCodigo(server.getCodigo());	
				System.out.println(serverVar.getCodigo());
			}
		};
	    try {
			System.out.println("Started..");
			future = executor.submit(server);	//inicia el thread
			System.out.println("Finished!");	
			server.addEventListener(svl); //añade el evento al thread
			executor2.schedule(new Runnable() { //para el thread cuando acaba el tiempo
			    @Override
			    public void run(){
			        future.cancel(true);
			    } 
			}, 50, TimeUnit.SECONDS);
			server.stopServer();
			
		    
		}catch(java.net.BindException e1){
			System.out.println("Ya hay un código generado");
			
		}finally {
			executor.shutdownNow();	
			executor2.shutdownNow();	
		}

	}
}
