package com.kh.ListEx;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		//add 사과 바나나 오렌지
		a.add("사과");
		a.add("바나나");
		a.add("오렌지");
		//출력 System.out.println(a);
		System.out.println(a);
		
		//get(1)을 사용해서 1에 들어있는 값 반환
		a.get(1);
		System.out.println(a);
		
		//set(1, "포도") 을 사용해서 바나나를 포도로 변경
		a.set(1, "포도");
		System.out.println(a);
		
		//size 이용해서 크기 반환
		a.size();
		System.out.println(a);
		
		//isEmpty() 리스크가 비어있는지 확인
		a.isEmpty();
		System.out.println(a);
		
		//remove(2) 지정된 자리 제거
		a.remove(2);
		System.out.println(a);
		
		//remove("사과") 사과 제거
		a.remove("사과");
		System.out.println(a);
		
		//clear 모두 제거
		a.clear();
		System.out.println(a);

	}

}
