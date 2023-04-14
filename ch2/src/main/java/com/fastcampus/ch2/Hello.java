package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.원격 호출 가능한 프로그램으로 등록하는 애너테이션
@Controller
public class Hello {

	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static변수

	// 2.URL과 메서드를 연결하는 애너테이션 (외부에서 호출 가능하게 하곘다는 의미이기도 하다.)
	@RequestMapping("/hello")
	
//	  public void main() { //인스턴스 메서드 - iv, vc 둘다 사용가능
//	  System.out.println("HELLO - static!");
//	  
//	  System.out.println(cv); //OK 
//	  //System.out.println(iv); //OK 
//	  }
	  
	 
	private void main1() { 
		/* private도 static처럼 가능하며 void 앞에 static을 빼도 작동된다.
		   이유는 우리 눈에 보이지 않는 어딘가에서 이미 프로그램상에서 객체를 생성해주고 있기 때문이라고 한다.
		   그래서 접근제어자 상관없이 호출이 가능하다.
		 */
		
		System.out.println("HELLO - private!");
		
		System.out.println(cv); //OK
		//System.out.println(iv); //OK
	}
	
	public static void main2() { // static메서드 - cv만 사용가능
		System.out.println(cv); // OK
		// System.out.println(iv); //에러
	}
}
/*
 * 이 파일은 테스트용으로 작성한 파일이며 정상적으로 작동이 된다 다만, 실제 페이지 상에서는 404 에러가 뜬다 하지만 콘솔에 찍힌 출력문은
 * 정상적으로 출력되는것을 보니 정상적으로 연결은 된것이다. 우선 연결만 시켰기 때문이라고 알아두면 될 것 같다.
 */
