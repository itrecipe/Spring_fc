package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main1(); //private�� �ܺο��� ȣ���ϴ� ���� �Ұ���

		//Reflection API�� ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ ����� �����Ѵ�.
		//java.lang.reflect ��Ű�� ����
		//Hello Ŭ������ Class��ü(Ŭ���� ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance(); //Class ��ü�� ���� ������ ��ü�� �����Ѵ�.
		Method main = helloClass.getDeclaredMethod("main"); //Method �޼��� ������ ���
		main.setAccessible(true); //���ٰ����ϰ� �Ѵ�.
		//private�� main()�� ȣ�Ⱑ���ϵ��� ���ش�.
		
		main.invoke(hello); //hello.main()�� ȣ���Ѵ�.
	}
}
