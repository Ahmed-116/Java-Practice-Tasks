import java.io.*;

import java.net.*;


public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        System.out.println("Client connected");

       InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String line = br.readLine();
        System.out.println("Server received: " + line);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("Yes");


    }
}
