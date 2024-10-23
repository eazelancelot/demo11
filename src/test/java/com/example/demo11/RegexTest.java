package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {
	
	@Test
	public void test0() {
		// \ 在 java 中表示跳脫符號，用來跳脫有特殊意義的符號 --> 讓有特殊意義的符號變成單純的字串
		// \ 跳脫符號無法單獨存在
		// \\ --> 第一個跳脫符號是讓第二個跳脫符號從有特殊意義變成單純的字串		
		String pattern = "\\";
		System.out.println(pattern);
		String path = "D:\\java_教學\\教學投影片";
	}
	
	@Test
	public void test() {
		// 比對手機號碼格式: 數字4碼-數字3碼-數字3碼
		// \d 表示數字 0~9 的任意其中一個
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼: 格式為 數字4碼-數字3碼-數字3碼");
		String input = scan.next();
		boolean check = input.matches(pattern);
		if(check) { // 等同於 check == true
			System.out.println(input + " 符合手機號碼格式!!");
		} else {
			System.out.println(input + " 不符合手機號碼格式!!");
		}
		//==============================
		// 上面的 input.matches(pattern) 的結果用變數 check 接回來
		// 但在後續的程式碼中，變數 check 指使用了一次
		// 所以可以使用匿名(不需要用變數名稱來接計算的結果)的方式來改寫
		if(input.matches(pattern)) { // 等同於 input.matches(pattern) == true
			System.out.println(input + " 符合手機號碼格式!!");
		} else {
			System.out.println(input + " 不符合手機號碼格式!!");
		}
	}
	
	@Test
	public void test1() {
		// 比對手機號碼格式: 數字4碼-數字3碼-數字3碼
		// \d 表示數字 0~9 的任意其中一個
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// 使用大括號 {} 處理 pattern 中重複出現的字串，但僅限於{}的前面那個字串
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// 上一行 -\\d{3} 重複出現了2次， -\\d{3} 是包含了 -, \\d, {3} 這3個字串
		// 所以需要用小括號將這3個字串框成同一組 (-\\d{3})，再用大括號處理重複的部分	
		String pattern = "\\d{4}(-\\d{3}){2}";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼: 格式為 數字4碼-數字3碼-數字3碼");
		String input = scan.next();
		
		if(input.matches(pattern)) { // 等同於 input.matches(pattern) == true
			System.out.println(input + " 符合手機號碼格式!!");
		} else {
			System.out.println(input + " 不符合手機號碼格式!!");
		}
	}
	
	@Test
	public void test2() {
		// 市話格式1: 數字2碼-數字7碼
		String pattern1 = "\\d{2}-\\d{7}";
		// 市話格式2: (數字2碼)-數字7碼
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼: 格式為 數字2碼-數字7碼 或是 (數字2碼)-數字7碼");
		String input = scan.next();
		if(input.matches(pattern1) || input.matches(pattern2)) {
			System.out.println(input + " 符合市話號碼格式!!");
		} else {
			System.out.println(input + " 不符合市話號碼格式!!");
		}
		//====================================
		// 合併 pattern1 和 pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if(input.matches(pattern3)) {
			System.out.println(input + " 符合市話號碼格式!!");
		} else {
			System.out.println(input + " 不符合市話號碼格式!!");
		}
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		if(input.matches(pattern4)) {
			System.out.println(input + " 符合市話號碼格式!!");
		} else {
			System.out.println(input + " 不符合市話號碼格式!!");
		}
	}
	
	@Test
	public void test3() {
		// 市話格式: 數字2碼-數字7碼或8碼
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// \\d{7,8} : 表示 \\d 至少出現7次，至多出現8次
		String pattern1 = "\\d{2}-\\d{7,8}";
		char c = 65;
		System.out.println(c);
	}
	
	@Test
	public void test4() {
		String pattern = "[A-CSW-Z]"; // 符合的字母有: A、B、C、S、W、X、Y、Z
		String str = "_";
		System.out.println(str.matches(pattern));
		String str1 = "\n";
		System.out.println("==========================");
		System.out.println(str1);
		System.out.println("==========================");
	}
	
	@Test
	public void test5() {
		String pattern = "0[\\d&&[^0]]{1,3}";
		String str = "0023";
		String str1 = "0123";
		System.out.println(str.matches(pattern));
		System.out.println(str1.matches(pattern));
	}
	
	@Test
	public void test6() {
		String pattern = "^aB$";
		String str = "aB";
		String str1 = "AB";
		System.out.println(str.matches(pattern));
		System.out.println(str1.matches(pattern));
	}
	
	@Test
	public void test7() {
		String pattern = "[A-Za-z][1-2]\\d{8}";	
		
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		// \\w ==> [A-Za-Z0-9_]
		String pattern2 = "[\\w&&[^ABDEFHabdefh0-9_]][1-2]\\d{8}";
	}
	
	
	
	

}
