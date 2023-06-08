package com.example.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class ReadDateFromServerThread extends Thread{
    private final Socket client;
    public ReadDateFromServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            InputStream clientInput = this.client.getInputStream();
            Scanner scanner = new Scanner(clientInput);
            while (true) {
                String data = scanner.nextLine();
                System.out.println("来自服务端的消息:" + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
