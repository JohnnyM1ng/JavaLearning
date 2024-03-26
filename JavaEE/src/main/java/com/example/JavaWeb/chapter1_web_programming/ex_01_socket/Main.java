package com.example.JavaWeb.chapter1_web_programming.ex_01_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)){
            System.out.println("等待客户端连接");
            Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为" + socket.getInetAddress().getHostAddress());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
