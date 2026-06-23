package ch19;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ServerEx {
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요");
		System.out.println("---------------------------------------------------");
		
		//TCP 서버 소켓
		startServer();
		
		// 키보드 입력
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		stopServer();
	}
	
	public static void startServer() {
		// 작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// 서버 소켓 생성 & Port 바인딩
					serverSocket = new ServerSocket(50001); // -> 이미 포트 사용 중일 경우 BindException
					System.out.println("[서버] 시작");
					// 다른 방법
//					ServerSocket serverSocket = new ServerSocket();
//					serverSocket.bind(new InetSocketAddress(50001));
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림 \n");
						// 연결 수락
						Socket socket = serverSocket.accept();	// 클라이언트 들어오기 전까지 블로킹(실행 멈춤)
						
						// 연결된 클라이언트 정보 얻기
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[서버]" + isa.getHostString() + "의 연결 요청을 수락함");
						
						
						
						socket.close();
						System.out.println("[서버]" + isa.getHostString() + "의 연결을 끊음");
					}
				}catch(IOException e) {
					System.out.println("[서버]" + e.getMessage());
				}
			}
		};
		
		thread.start();
	}
	public static void stopServer() {
		try {
			//ServerSocket을 닫고 Port 언바인딩
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		}catch(IOException e) {}
	}
}
