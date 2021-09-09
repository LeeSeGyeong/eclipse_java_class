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
    * -서버 , 클라이언트 간의 1:1 소켓통신
    * -데이터를 교환하기 전 서버,클라이언트가 연결되어있어야함 
    * (서버가 먼저 실행되서 클라이언트의 요청을 기다리고 있을거임)
    * -신뢰성있는 데이터 전달 가능 
    * 
    * *Socket
    * -프로세스 간 통신을 담당 
    * - Input/OutputStream을 가지고 있음 (이 스트림을 통해 입출력이 이루어짐)
    * 
    * * ServerSoket
    * - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 들어오면 수락해줄 용도 
    *   수락 => 통신할 수 있는 Soket생성
    */
   //서버용 프로그램 
   public static void main(String[] args) {
      
      
      Scanner sc = new Scanner(System.in);
      
      
      //스트림 선언 
      
      BufferedReader br = null;
      PrintWriter pw = null; //한줄단위로 출력해주는 보조스트림 
      
      //1) 포트 번호 지정(서버측에서 몇 번 포트로 통로를 열겠냐는 의미)
      
      int port = 3000;
      
      //2) ServerSoket 객체 생성 시 포트결합(Bind) (ServerSoket은 오직 클라이언트 외부의 연결요청만을 받아주는 용도의 소켓)
   
      ServerSocket  server = null;
      try {
         server = new ServerSocket(port);
         
         //3) 클라이언트로부터 접속요청이 올때까지 대기상태 
         System.out.println("클라이언트의 요청을 기다리고 있습니다...");
         
         //4) 연결 요청이 오면 요청수락 후 (accect())
         //   해당클라이언트와 통신할 수 있는 서버 측 소켓객체(Socket socket = new ~ ) 생성하기
         Socket socket = server.accept();
         System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함..."); //ip주소 
         
         //5) 클라이언트와 입출력스트림 생성(바이트 스트림으로밖에 안됨..)
         //6)보조스트림을 통해서 성능개선

         //입력용스트림(클라이언트로부터 전달된 값을 한줄단위로 읽어들이기위한 입력용 스트림!)
         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         //2byte로 변환 후(new InputStreamReader) BufferedReader로 한줄출력 보조스트림 추가
         
         
         //출력용스트림(클라이언트에게 값을 한줄단위로 출력할 수 있는 출력용스트림)
         pw = new PrintWriter(socket.getOutputStream());
         // PrintWriter : 데이터 출력시 print(), println() 메소드를 가지고있는 보조스트림
         
         while(true) {
            // 7) 만들어진 스트림을 통해 읽고 쓰기
            // 클라이언트로부터 전달된 메세지가 있을 경우 서버측에서 읽어들일거임(읽어들인다 == 입력 )
            
            String message = br.readLine();
            System.out.println("클라이언트로부터 전달받은 메세지 : "+ message);
            
            //반대로 클라이언트에게 데이터 전달! (출력)
            
            System.out.print("클라이언트에게 보낼 내용 :");
            String sendMessage = sc.nextLine();
            
            pw.println(sendMessage); // 클라이언트에게 출력 
            pw.flush();//현재 스트림에 있는 데이터를 강제로 내보내는 메소드
            //( 원래 close호출되면 자동으로 flush되지만 무한반복되니까 안닫히므로 강제로 닫아줌)
            
         }
            
      
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         
         //8) 통신종료 
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