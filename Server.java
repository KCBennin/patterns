package demo;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame {

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;

	// constructor
	public Server() {
		super("SERVER");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				sendMessage(event.getActionCommand());
				userText.setText("");

			}
		});
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(400, 200);
		setVisible(true);
	}

	// set up and run server
	public void startRunning() {
		try {
			server = new ServerSocket(6789, 100);
			while (true) {
				try { // connect and have conversation
					waitForConnection();
					setupStreams();
					whileChatting();

				} catch (EOFException eofException) {
					showMessage("\n Server ended connection!");
				} finally {
					closeChat();
				}
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	// wait for connection, then display connection info
	private void waitForConnection() throws IOException {
		showMessage(" Waiting for someone to connect.. \n");
		connection = server.accept();
		showMessage(" Now connected to " + connection.getInetAddress().getHostName());
	}

	// get streams and send and receive data
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now set up \n");
	}

	// during the chat conversation
	private void whileChatting() throws IOException {
		String message = " You are now connected! ";
		sendMessage(message);
		ableToType(true);
		do {
			try {
				message = (String) input.readObject();
				showMessage("\n" + message);
			} catch (ClassNotFoundException classNotFoundexception) {
				showMessage("\n what did the user send?");
			}
			// have a conversation
		} while (!message.equals("CLIENT - END"));
	}

	// close streams and sockets after you are finished chatting
	private void closeChat() {
		showMessage("\n Closing coneection.. \n");
		ableToType(false);
		try {
			output.close();
			input.close();
			connection.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	// send message to client
	private void sendMessage(String message) {
		try {
			output.writeObject("SERVER -  " + message);
			output.flush();
			showMessage("\nSERVER - " + message);
		} catch (IOException ioException) {
			chatWindow.append("\n ERROR: CANT SEND MESSAGE");
		}
	}

	// update chatWindow
	private void showMessage(final String text) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				chatWindow.append(text);
			}
		}
	  );
	}
	//let the user type messages into the box
	private void ableToType(final boolean tof) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				userText.setEditable(tof);
			}
		}
	  );
	}
  }

