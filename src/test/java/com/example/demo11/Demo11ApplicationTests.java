package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class Demo11ApplicationTests {

	@Test
	void contextLoads() {
		int a = 10;
		Integer b = 20; // class ���w�]�ȬO null / NULL
		Integer c = new Integer(30);
		// class ���O
		String str = "abc";
		String str1 = new String("abc");
		//================================
		int aaa; // �w�]�ȬO 0
		Integer bbb; // �w�]�ȬO null�F�]�� Integre �O ���O(class)
	}
	
	@Test
	public void stringTest() {
		String str = "abc";
		str = str + "ABC"; // str = "abcABC"
		System.out.println(str);
	}
	
	@Test
	public void stringTest2() {
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str == str1);
		System.out.println(str1 == str2);
		System.out.println(str.equals(str2));
	}
	
	@Test
	public void stringBufferTest() {		
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC");
		strBuf.append("DEF").append("QQQ");
		System.out.println(strBuf.toString());
	}
	
	@Test
	public void stringReverseTest() {
		String str = "abcde"; // ���� 5
		String[] strArray = str.split(""); // [a, b, c, d, e]
		                             //index:  0  1  2  3  4
		String newStr = "";
		for(int i = strArray.length - 1; i >= 0; i--) {
			String item = strArray[i];
			newStr = newStr + item;
			// �Ĥ@��: i = 4; item = "e"; newStr �q "" --> ""+"e" = "e"
			// �ĤG��: i = 3; item = "d"; newStr �q "e" --> "e"+"d" = "ed"
			// �ĤT��: i = 2; item = "c";
			// �ĥ|��: i = 1; item = "b";
			// �Ĥ���: i = 0; item = "a";
		}
		//===================================
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();
	}
	
	@Test
	public void tttTest() {
		int a = 5;
		if(a >= 18) {
			System.out.println("�~��: " + a);
			System.out.println("�w���~");
		}
		
	}
	
	
	@Test
	public void interfaceTest() {
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.NUM);
		System.out.println(MyInterface.NUM2);
	}
	
	

}
