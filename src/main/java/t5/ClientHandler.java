package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {

    private ArrayList<ClientHandler> clients;
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private String title;

    public ClientHandler(Socket socket, ArrayList<ClientHandler> clients, String title) {
        try {
            this.socket = socket;
            this.clients = clients;
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.writer = new PrintWriter(socket.getOutputStream(), true);
            this.title=title;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
    	
        try {
            String msg;
            File file = new File(title);
            FileWriter fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw);
            while ((msg = reader.readLine()) != null) {
                if (msg.equalsIgnoreCase("exit")) {
                	reader.close();
                    writer.close();
                    socket.close();
                    for (ClientHandler cl : clients) {
                        cl.writer.println("client has left the project");
                        pw.println(msg);
                    }
                }
                for (ClientHandler cl : clients) {
                    cl.writer.println(msg);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                writer.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}