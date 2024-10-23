package com.example.demo11;

public class Dog {
	//妮┦(疭┦)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//﹚竡よ猭(︽)	
	public void run() {
		System.out.println("タ禲!!");
	}
	
	// よ猭更(overload)
	// 1. よ猭嘿妓琌よ猭い把计计ぃ妓㊣ run よ猭侩琌㊣礚把计临琌Τ把计よ猭
	public void run(String name) {
		System.out.println(name + "タ禲!!");
	}
	// 2. よ猭嘿妓よ猭い把计计妓琌竚把计戈篈ぃ妓
	public void run(int age, String category) {
		System.out.println(category + "タ禲!!");
	}
	public void run(String category, int age) {
		System.out.println(category + "タ禲!!");
	}
	
	public void running() {
		System.out.println(name + "タ禲!!");
	}
	
	public void eat(String name) {
		// : 臦羆稲跑Θ璂羆
		System.out.println(this.name + "稲跑Θ" + name);
	}
	

	
	
	
	
	
	
}
