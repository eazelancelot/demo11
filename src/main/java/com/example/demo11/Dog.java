package com.example.demo11;

public class Dog {
	//�ŧi�ݩ�(�S��)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//�w�q��k(�欰)	
	public void run() {
		System.out.println("���b�]!!");
	}
	
	// ��k���h��(overload)
	// 1. ��k�W�٤@�ˡA���O��k�����ѼƭӼƤ��@�ˡA�I�s run ��k�ɥi�H��O�O�I�s�L�Ѽƪ��٬O���Ѽƪ���k
	public void run(String name) {
		System.out.println(name + "���b�]!!");
	}
	// 2. ��k�W�٤@�ˡA��k�����ѼƭӼƤ@�ˡA���O�ۦP��m���ѼƸ�ƫ��A���@��
	public void run(int age, String category) {
		System.out.println(category + "���b�]!!");
	}
	public void run(String category, int age) {
		System.out.println(category + "���b�]!!");
	}
	
	public void running() {
		System.out.println(name + "���b�]!!");
	}
	
	public void eat(String name) {
		// �L�X: �Q���`��ܷR�Y�ܦ��D�`��
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);
	}
	

	
	
	
	
	
	
}
