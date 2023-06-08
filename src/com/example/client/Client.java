package com.example.client;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {

            String host = "127.0.0.1";

            int port = 6666;

            Socket client = new Socket(host, port);
            new WriteDateToServerThread(client).start();
            new ReadDateFromServerThread(client).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
