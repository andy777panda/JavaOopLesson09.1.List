package net.ukr.andy777;

/*
 Lesson09
 1. Написать метод, который 
 - создаст список, 
 - положит в него 10 элементов, 
 - затем удалит первые два и последний, 
 - а затем выведет результат на экран.
 */

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		// створення списку
		List<Integer> arr = new ArrayList<Integer>();
		
		// наповнення списку елементами
		for (int i = 0; i < 10; i++) {
			arr.add((int)(Math.random()*10));
		}
		System.out.println(arr);

		// видалення перших двох та останнього елемента
		arr.remove(0);
		arr.remove(0);
		arr.remove(arr.size()-1);
		
		// вивід результату на екран
		System.out.println(arr);
	}
}