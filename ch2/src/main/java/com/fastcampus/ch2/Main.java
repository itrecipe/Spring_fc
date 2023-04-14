package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main1(); //private라서 외부에서 호출하는 것은 불가능

		//Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능을 제공한다.
		//java.lang.reflect 패키지 제공
		//Hello 클래스의 Class객체(클래스 정보를 담고 있는 객체)를 얻어온다.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance(); //Class 객체가 가진 정보로 객체를 생성한다.
		Method main = helloClass.getDeclaredMethod("main"); //Method 메서드 참조시 사용
		main.setAccessible(true); //접근가능하게 한다.
		//private인 main()을 호출가능하도록 해준다.
		
		main.invoke(hello); //hello.main()을 호출한다.
	}
}
