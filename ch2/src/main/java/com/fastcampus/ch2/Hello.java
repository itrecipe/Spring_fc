package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.���� ȣ�� ������ ���α׷����� ����ϴ� �ֳ����̼�
@Controller
public class Hello {

	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static����

	// 2.URL�� �޼��带 �����ϴ� �ֳ����̼� (�ܺο��� ȣ�� �����ϰ� �ρٴٴ� �ǹ��̱⵵ �ϴ�.)
	@RequestMapping("/hello")
	
//	  public void main() { //�ν��Ͻ� �޼��� - iv, vc �Ѵ� ��밡��
//	  System.out.println("HELLO - static!");
//	  
//	  System.out.println(cv); //OK 
//	  //System.out.println(iv); //OK 
//	  }
	  
	 
	private void main1() { 
		/* private�� staticó�� �����ϸ� void �տ� static�� ���� �۵��ȴ�.
		   ������ �츮 ���� ������ �ʴ� ��򰡿��� �̹� ���α׷��󿡼� ��ü�� �������ְ� �ֱ� �����̶�� �Ѵ�.
		   �׷��� ���������� ������� ȣ���� �����ϴ�.
		 */
		
		System.out.println("HELLO - private!");
		
		System.out.println(cv); //OK
		//System.out.println(iv); //OK
	}
	
	public static void main2() { // static�޼��� - cv�� ��밡��
		System.out.println(cv); // OK
		// System.out.println(iv); //����
	}
}
/*
 * �� ������ �׽�Ʈ������ �ۼ��� �����̸� ���������� �۵��� �ȴ� �ٸ�, ���� ������ �󿡼��� 404 ������ ��� ������ �ֿܼ� ���� ��¹���
 * ���������� ��µǴ°��� ���� ���������� ������ �Ȱ��̴�. �켱 ���Ḹ ���ױ� �����̶�� �˾Ƶθ� �� �� ����.
 */
