package sever;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket sever = new ServerSocket(8500);
        Socket sock = sever.accept();
        Scanner scan = new Scanner(sock.getInputStream());
        while(scan.hasNext()){
            String linha = scan.nextLine();
            System.out.println(linha);
        }
    }
}
