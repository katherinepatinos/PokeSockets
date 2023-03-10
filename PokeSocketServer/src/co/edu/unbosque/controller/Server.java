package co.edu.unbosque.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private Socket socket;
	private ServerSocket servidor;
	ClientHandler client;

	public Server(int port){

			try {
				servidor = new ServerSocket(port);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	
	public void startServer() {

		socket = new Socket();
		try {
			while (true) {

				socket = servidor.accept();
				System.out.println("Entro un entrenador");

				client = new ClientHandler(socket);
				
				Thread hilo = new Thread(client);
				hilo.start();
	}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * @return the client
	 */
	public ClientHandler getClient() {
		return client;
	}
	
	
}
