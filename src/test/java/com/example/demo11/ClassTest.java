package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest() {
		// 使用關鍵字 new 建立實例(instance)
		Dog myDog = new Dog();
		myDog.running();
		// 設定每個實例不同的屬性(特性)
		myDog.category = "柴犬";
		myDog.color = "淺黃色";
		myDog.name = "霸氣的總柴";
		myDog.age = 1;
		
		System.out.println("狗的品種: " + myDog.category);
		System.out.println("我家的狗毛髮是 " + myDog.color);
		//===============
		// 使用方法(行為)
		myDog.run();
		myDog.running();
		myDog.eat("胖總柴");
	}
	
	@Test
	public void bankTest() {
		Bank bank = new Bank();
		bank.setUser("AAA");
		bank.setBalance(1000);	
//		//存款
		bank.saving(5000);
		//提款
		bank.withdraw(3000);
	}
	
	@Test
	public void stringTest() {
		// withdraw31 是靜態方法，可以直接透過 類別名稱.靜態方法 呼叫
		Bank.withdraw31(null, null, null, 0);
		// withdraw3 是一般方法，必須要先把類別 new 出來後才能呼叫
		Bank bank = new Bank();
		bank.withdraw3("title", "TTA分行", "AAA", 0);
		//============================
		Math.random();
		Random ran = new Random();		
		ran.nextInt(0, 0);
		
	}
	
	@Test
	public void bankTest2() {
//		Bank bank = new Bank();
//		bank.setBranch("TTA");
//		bank.setUser("AAA");
//		bank.setBalance(1000);
		//======================
		Bank bank1 = new Bank("TTB", "BBB", 2000);
		System.out.println("======================");
	}
	
	@Test
	public void stringTest3() {
		String str = "ABCADAQW";
		String newStr = str.replace("A", "Z");
		String newStr1 = str.replaceAll("A", "Z");
		System.out.println(newStr);
		System.out.println(newStr1);
		
		String newStr2 = str.replaceAll("[A-C]", "Z");
		System.out.println(newStr2);
		
		String newStr3 = str.replace("[A-C]", "Z");
		System.out.println(newStr3);
	}
	
	
	
	
	
	
	

}
