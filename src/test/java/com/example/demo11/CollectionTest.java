package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest() {
		String str = new String();
		Bank bank = new Bank();
		// List �O����(interface)�A�u�O�Ψөw�q��k�Ӥw�A�õL�����@���e�F�ҥH�L�k�ϥ� new �إ߹��
		// ArrayList �O�Ψӹ�{�w�q�b List ����k����@���O
		List<Bank> list = new ArrayList<>();
		// List <>������ƫ��A�����8�ذ򥻸�ƫ��A�A�N��N�O�u������O(class)
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(1);
		intList.add(3);
		intList.add(2, 5);
		for (Integer item : intList) {
			System.out.println(item);
		}
		System.out.println("==================");
		intList.remove(2);
		for (Integer item : intList) {
			System.out.println(item);
		}
	}

	@Test
	public void listTest1() {
		ArrayList<String> list = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("A");
		strList.add("C");
		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(i).equals("B")) {
				strList.remove(strList.get(i));
			}
			System.out.println(strList.get(i));
		}
//		System.out.println("=====================");
//		for(String item : strList) {			
//			if(item.equals("B")) {
//				strList.remove(item);
//			}
//			System.out.println(item);
//		}
//		strList.forEach(item -> {
//			if(item.equals("B")) {
//				strList.remove(item);
//			}
//		});

	}

	@Test
	public void listTest2() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("A");
		strList.add("C");
		System.out.println(strList.get(0));
		System.out.println(strList.get(strList.size() - 1));

	}

	@Test
	public void hashSetTest() {
		// HashSet
		// 1. �ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2. �L��(���|�̷ӷs�W�����ǨӱƦC)
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void linkedHashSetTest() {
		// LinkedHashSet
		// 1. �ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2. ����(�|�̷ӷs�W�����ǨӱƦC)
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void treeSetTest() {
		// TreeSet
		// 1. �ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2. �Ѥp��j�ƦC
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void setTest() {
		TreeSet<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10 ���ü�
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			// �W�z���A�]�� number �Q�ŧi��A�b���򪺵{���X�u�Q�ϥΤ@���A�i�H�ΰΦW���覡�X��
			set.add(ran.nextInt(1, 11));
		}
		System.out.println("min: " + set.first());
		System.out.println("max: " + set.last());
		// �Ѥp��j
		System.out.println(set);
		// �Ѥj��p
		System.out.println(set.descendingSet());
	}

	@Test
	public void setTest2() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10 ���ü�
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			// �W�z���A�]�� number �Q�ŧi��A�b���򪺵{���X�u�Q�ϥΤ@���A�i�H�ΰΦW���覡�X��
			set.add(ran.nextInt(1, 11));
		}
		// �૬: �N�Ȫ���ƫ��A�ഫ���t�@�ظ�ƫ��A
		// 1. �Q�૬����ƫ��A�g�b�ܼƫe���A�@�w�n���p�A�� (TreeSet<Integer>)set
		// 2. �ϥΤp�A���N�ഫ����ƫ��A�M�Ȯئb�@�_�A�o�ˤ~��ϥ��ഫ��ƫ��A�᪺��k
		// 3. �V��
		System.out.println("min: " + ((TreeSet<Integer>) set).first());
		System.out.println("max: " + ((TreeSet<Integer>) set).last());
	}

	@Test
	public void setTest3() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		while (set.size() < 5) {
			// 1~10 ���ü�
//			int number = ran.nextInt(1, 11);
//			set.add(number);
			// �W�z���A�]�� number �Q�ŧi��A�b���򪺵{���X�u�Q�ϥΤ@���A�i�H�ΰΦW���覡�X��
			set.add(ran.nextInt(1, 11));
		}
		// �N Set �ন List
		List<Integer> list = new ArrayList<>(set);
		System.out.println("min: " + list.get(0));
		System.out.println("max: " + list.get(list.size() - 1));
		// �Ѥp��j
		System.out.println(list);
		// �Ѥj��p(treeSet ���ϧ�)
		Collections.reverse(list); // reverse: ����Ƨ�
		System.out.println(list);
	}

	@Test
	public void mapTest() {
		// Map<key ����ƫ��A, value ����ƫ��A>
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		// �ϥ� get(key ��) �z�L key �N������ value ���X
		String str = map.get(2);
		System.out.println(str);
		// �M��: �ϥ� foreach �N map ���� key-value ���X
		// �N map �ন entrySet�Aitem �N�O�]�t�F key �M value�A�i�H�ϥ� getKey �M getValue ����
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("======");
		// �N map �ন keySet�A�C�� item �N��ܤ@�� key�A�z�L get(item) �N������ value ���X
		for (Integer item : map.keySet()) {
			System.out.println("key: " + item);
			System.out.println("value: " + map.get(item));
		}
		System.out.println("======");
		// �쥻 map ���A�w�s�b key = 1 �H�ι����� value = A;
		// �{�b�b�ۦP1����m��J D�Akey=1 ������� value �|�ܦ� D(�ۦP key�A������ value ��\�e)
		map.put(1, "D");
		// ���P�� key�A�i�H���ۦP�Τ��P������ value
		map.put(4, "D");
		for (Integer item : map.keySet()) {
			System.out.println("key: " + item);
			System.out.println("value: " + map.get(item));
		}

	}

	@Test
	public void mapTest2() {
		// key-value �O 1��1
		Map<Integer, String> map = new HashMap<>();
		// key-value �O 1��h
		Map<Integer, String[]> map2 = new HashMap<>();
		Map<Integer, List<String>> map3 = new HashMap<>();
		Map<Integer, Set<String>> map4 = new HashMap<>();
		Map<Integer, Map<String, String>> map5 = new HashMap<>();
	}

	@Test
	public void test123() {
		// isEmpty(): �߰ݶ��X�άO Map �� size �O�_�� 0(�Ū�)
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());

		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());

		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		// =========
		System.out.println("=============");
		List<String> list2 = null;
		// �]�� list2 �O null�A�ҥH�L�k�ϥ� null �z�L .��k() �Ӱ���{���A�|����
		// �U��{���X�|�� NullPointerException(�ū��w���~)
		System.out.println(list2.isEmpty());
	}

	@Test
	public void mapTest3() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(7, 1);
		System.out.println(map);
	}

}
