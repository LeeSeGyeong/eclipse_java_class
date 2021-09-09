package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

   /*
    * * TCP(Transmission Control Protocol)
    * -���� , Ŭ���̾�Ʈ ���� 1:1 �������
    * -�����͸� ��ȯ�ϱ� �� ����,Ŭ���̾�Ʈ�� ����Ǿ��־���� 
    * (������ ���� ����Ǽ� Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��������)
    * -�ŷڼ��ִ� ������ ���� ���� 
    * 
    * *Socket
    * -���μ��� �� ����� ��� 
    * - Input/OutputStream�� ������ ���� (�� ��Ʈ���� ���� ������� �̷����)
    * 
    * * ServerSoket
    * - ��Ʈ�� ����(Bind)�Ǿ� �ܺ��� ���� ��û�� ��ٸ��� �����û�� ������ �������� �뵵 
    *   ���� => ����� �� �ִ� Soket����
    */
   //������ ���α׷� 
   public static void main(String[] args) {
      
      
      Scanner sc = new Scanner(System.in);
      
      
      //��Ʈ�� ���� 
      
      BufferedReader br = null;
      PrintWriter pw = null; //���ٴ����� ������ִ� ������Ʈ�� 
      
      //1) ��Ʈ ��ȣ ����(���������� �� �� ��Ʈ�� ��θ� ���ڳĴ� �ǹ�)
      
      int port = 3000;
      
      //2) ServerSoket ��ü ���� �� ��Ʈ����(Bind) (ServerSoket�� ���� Ŭ���̾�Ʈ �ܺ��� �����û���� �޾��ִ� �뵵�� ����)
   
      ServerSocket  server = null;
      try {
         server = new ServerSocket(port);
         
         //3) Ŭ���̾�Ʈ�κ��� ���ӿ�û�� �ö����� ������ 
         System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�...");
         
         //4) ���� ��û�� ���� ��û���� �� (accect())
         //   �ش�Ŭ���̾�Ʈ�� ����� �� �ִ� ���� �� ���ϰ�ü(Socket socket = new ~ ) �����ϱ�
         Socket socket = server.accept();
         System.out.println(socket.getInetAddress().getHostAddress()+"�� ������ ��û��..."); //ip�ּ� 
         
         //5) Ŭ���̾�Ʈ�� ����½�Ʈ�� ����(����Ʈ ��Ʈ�����ιۿ� �ȵ�..)
         //6)������Ʈ���� ���ؼ� ���ɰ���

         //�Է¿뽺Ʈ��(Ŭ���̾�Ʈ�κ��� ���޵� ���� ���ٴ����� �о���̱����� �Է¿� ��Ʈ��!)
         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         //2byte�� ��ȯ ��(new InputStreamReader) BufferedReader�� ������� ������Ʈ�� �߰�
         
         
         //��¿뽺Ʈ��(Ŭ���̾�Ʈ���� ���� ���ٴ����� ����� �� �ִ� ��¿뽺Ʈ��)
         pw = new PrintWriter(socket.getOutputStream());
         // PrintWriter : ������ ��½� print(), println() �޼ҵ带 �������ִ� ������Ʈ��
         
         while(true) {
            // 7) ������� ��Ʈ���� ���� �а� ����
            // Ŭ���̾�Ʈ�κ��� ���޵� �޼����� ���� ��� ���������� �о���ϰ���(�о���δ� == �Է� )
            
            String message = br.readLine();
            System.out.println("Ŭ���̾�Ʈ�κ��� ���޹��� �޼��� : "+ message);
            
            //�ݴ�� Ŭ���̾�Ʈ���� ������ ����! (���)
            
            System.out.print("Ŭ���̾�Ʈ���� ���� ���� :");
            String sendMessage = sc.nextLine();
            
            pw.println(sendMessage); // Ŭ���̾�Ʈ���� ��� 
            pw.flush();//���� ��Ʈ���� �ִ� �����͸� ������ �������� �޼ҵ�
            //( ���� closeȣ��Ǹ� �ڵ����� flush������ ���ѹݺ��Ǵϱ� �ȴ����Ƿ� ������ �ݾ���)
            
         }
            
      
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         
         //8) ������� 
         try {
            pw.close();
            br.close();
            
            server.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }
      
   }

}