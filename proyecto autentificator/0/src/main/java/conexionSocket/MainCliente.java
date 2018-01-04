package conexionSocket;

import java.io.IOException;

import conexionSocket.Cliente;


//Clase principal que hará uso del cliente
public class MainCliente
{
    public static void main(String[] args) throws IOException
    {
        Cliente cli = new Cliente(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient("hola"); //Se inicia el cliente
    }
}