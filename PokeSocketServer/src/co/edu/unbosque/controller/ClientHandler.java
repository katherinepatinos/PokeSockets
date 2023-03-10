package co.edu.unbosque.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable{

	private DataInputStream in;
	private DataOutputStream out;
	private Socket sc;
	private String recibido;
	
	public ClientHandler(Socket sc) {
		
		this.sc = sc;
		recibido = "";
		try {
			out = new DataOutputStream(sc.getOutputStream());
			in = new DataInputStream(sc.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		while (true) {
			
			try {
				recibido = in.readUTF();
				System.out.println(recibido);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void enviar(String msj) {
		
		try {
			out.writeUTF(msj); 
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	/**
	 * @return the recibido
	 */
	public String getRecibido() {
		return recibido;
	}
	
	
	
}
