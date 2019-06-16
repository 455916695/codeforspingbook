package com.ax.IOtest;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * BIO测试
 */
public class BIOTest {

    @Test
    public void socketClient() throws InterruptedException {

        new Thread(() -> {
            Socket socket = null;
            try {
                socket = new Socket("127.0.0.1", 61616);
                while (true) {
                    socket.getOutputStream().write((Thread.currentThread().getName() + ":" + new Date() + ":World").getBytes());
                    socket.getOutputStream().flush();
                    try {
                        //睡眠10秒
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            Socket socket = null;
            try {
                socket = new Socket("127.0.0.1", 61616);
                while (true) {
                    socket.getOutputStream().write((Thread.currentThread().getName() + ":" + new Date() + ":World").getBytes());
                    socket.getOutputStream().flush();
                    try {
                        //睡眠10秒
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(1000 * 60 * 10);
    }



    @Test
    public void socketServer() throws IOException, InterruptedException {
        //服务端处理客户端连接请求
        ServerSocket serverSocket = new ServerSocket(61616);

        //接收到客户端连接请求之后为每个客户端创建一个新的线程进行链路处理
        new Thread(() -> {

            while (true) {
                try {

                    Socket socket = serverSocket.accept();

                    socket.getOutputStream().write("已连接".getBytes());

                    new Thread(() -> {
                        try {
                            int len;
                            byte[] bytes = new byte[1024];

                            InputStream inputStream = socket.getInputStream();

                            while ((len = (inputStream.read(bytes))) != -1) {
                                System.out.println(new String(bytes, 0, len));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }).start();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }).start();


        Thread.sleep(1000 * 60 * 10);
    }

}
