package Socket.demo1;

import com.alibaba.druid.support.spring.DruidNativeJdbcExtractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

                            String str = null;
                            while ((str = bufferedReader.readLine()) != null)
                                System.out.println(str);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
        }
    }
}
