package co.edu.unbosque.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import co.edu.unbosque.view.*;

public class Cliente {

	private DataInputStream in;
	private DataOutputStream out;
	private Socket sc;
	private String host;
	private int port;

	public Cliente(int puerto) {

		try {
			host = "127.0.0.1";
			this.port = puerto;
			sc = new Socket(host, port);
			this.in = new DataInputStream(sc.getInputStream());
			this.out = new DataOutputStream(sc.getOutputStream());
			;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String enivarComando(String comando) {

		String msj = "";
		try {
			out.writeUTF(comando);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return msj;
	}

	public void recibirMsj() {

		new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {
					try {
						String msj = "";
						msj = in.readUTF();
						System.out.println(msj);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}

	public void cerrar() {

		try {
			out.writeUTF("Cerrar");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
