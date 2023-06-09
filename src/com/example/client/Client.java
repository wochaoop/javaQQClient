package com.example.client;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {

            String host = "frp-fan.top";

            int port = 43819;

            Socket client = new Socket(host, port);
            new WriteDateToServerThread(client).start();
            new ReadDateFromServerThread(client).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
