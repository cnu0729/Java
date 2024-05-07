package com.kh.ThreadPre;

public class 우선순위스레드 {
	//main
	public static void main(String[] args) {
		//for문으로 1부터 3까지 반복
		//1~3까지 차례대로 실행 할 수 있도록 설정
		for(int i=1; i<=3; i++) {
			/*
			 Thread.MIN_PRIORITY = 우선순위 1   = 제일 나중에 실행
			 Thread.NORM_PRIORITY = 우선순위 5 	  (기본)
 			 Thread.MAX_PRIORITY = 우선순위 10  = 제일 먼저 실행
			*/
			스레드연습 n = new 스레드연습(i);
			if(i==1) {
				n.setPriority(Thread.MAX_PRIORITY);
			}else if(i==2){
				n.setPriority(Thread.NORM_PRIORITY);
			}else {
				n.setPriority(Thread.MIN_PRIORITY);
			}
			n.start();
		}
	}
}
