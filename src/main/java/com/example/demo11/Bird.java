package com.example.demo11;

public class Bird extends Animal {
	// 使用關鍵字 extends 來繼承 Animal 中已有的屬性和方法
	// 1. 屬性 name 以及存取私有屬性的 getter/setter 方法
	// 2. eat, sleep 方法
	// 以上的屬性以及方法在 Animal 都有，不需要再撰寫一次	
	
	//建構方法
	// 預設建構方法(沒有參數的建構方法)
	public Bird() {
		// 1. 在呼叫子類別的建構方法之前，會先呼叫父類別的建構方法，不管是預設建構方法還是帶有參數的建構方法
		// 2. 即使省略呼叫父類別的 super() 方法， 程式依然會先執行呼叫父類別的建構方法
		super();
		System.out.println("這是子類別");
	}

	// bird 的 name 和 age 繼承自父類別 Animal，所以帶有 name 和 age 的建構方法會去呼叫父類別的建構方法
	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	
	// 可透過關鍵字 super 來使用定義在父類別中 public 方法
	// 屬性 name 的權限是 private，只能在 Animal 類別中使用
	public void flying() {
		System.out.println(super.getName() + " 太胖飛不動!!");
		// 目前 Java 的版本可以將關鍵字 super 省略
		System.out.println(getName() + " 太胖飛不動!!");
	}

	public void flying2() {
		// 因為屬性 age 權限是 protected，所以子類別可以直接存取該屬性
		System.out.println("今年 " + age + " 歲，" + getName() + " 太胖飛不動!!");
	}

	// 1. 子類別可以重新定義(不同的實作內容)父類別的方法
	// 2. @Override 就是用來標記子類別重新定義父類別的方法；目前的 Java 版本，此註釋可省略，建議加
	// 2.1 @ 是 Annotation，註釋；會在程式碼中提供訊息，這些訊息會在編譯或是執行時被處理
	// 3. 被子類別重新定義的方法:
	//    3.1 權限不可比父類別小
	//    3.2 回傳的資料型態要一樣
	//    3.3 方法名稱和小括號中的參數數量以及每個參數的資料型態都要一樣
	//    3.4 唯一的不同就是大括號中的實作內容
	@Override
	public void eat() {
		System.out.println(getName() + " 吃不停");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + " 睡很多");
	}
	
	
	
	
	
	
}
