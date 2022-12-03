package t5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javafx.scene.layout.VBox;

public class Client {
	private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    public String username;

    public Client(Socket socket,String username) {
        try{
            this.socket = socket;
            this.username=username;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        }catch(IOException e){
            System.out.println("Error creating Client!");
            e.printStackTrace();
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    private void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        try{
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (socket != null) {
                socket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void sendMessage(String messageToSend) {
    	try{
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            Scanner sc= new Scanner(System.in);
            while(socket.isConnected()) {
            	
            	bufferedWriter.write(username+": "+ messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            
        }catch(IOException e){
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    	
    }
    
//    public void listenForMessage(VBox vbox_messages) {
//    	new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				String msgFromGroupChat;
//				
//				while(socket.isConnected()) {
//					try {
//						msgFromGroupChat= bufferedReader.readLine();
//						ClientController.addLabel(msgFromGroupChat,vbox_messages);
//						
//					}catch(IOException e){
//			            closeEverything(socket, bufferedReader, bufferedWriter);
//			        }
//				}
//			}
//    		
//    	}).start();
//    }
    
    public static void main(String args[]) throws UnknownHostException, IOException {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the username");
    	String username=sc.nextLine();
    	Socket socket= new Socket("localhost",1234);
    	Client client = new Client(socket,username);
    }
}
