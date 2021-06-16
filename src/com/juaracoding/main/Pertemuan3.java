package com.juaracoding.main;

import java.util.Scanner;

//Java Fundamental
public class Pertemuan3 {

	int n = 2;
	int a = 10;
	int totalMax = 20;
	int targetId = 15;
	boolean isLoop = true;
//	int myArray[] = new int[4];
	int myArray[] = {1,2,3,4,5};
	
	public void pilih() {
		switch (n) {
		case 1: {
			System.out.println("Ini satu");
			break;
		}
		case 2: {
			System.out.println("Ini dua");
			break;
		}
		default:
			System.out.println("Ini bukan satu dan dua");
		}
	}

	public void perulangan() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void ketika() {
		while (a >= 2 && isLoop) {
			System.out.println(a);
			if (a == 6) {
				isLoop = false;
			}
			a = a - 2;
		}
	}

	public void lakukan() {
		do {
			System.out.println(a);
			if (a == 6) {
				isLoop = false;
			}
			a = a - 2;
		} while (a >= 2 && isLoop);
	}

	public void jikaPilih() {
		Scanner scanner = new Scanner(System.in);
		while (isLoop) {
			System.out.print("Masukkan angka : ");
			int b = scanner.nextInt();
			switch (b) {
			case 1: {
				System.out.println("Ini satu");
				isLoop = false;
				break;
			}
			case 2: {
				System.out.println("Ini dua");
				isLoop = false;
				break;
			}
			default:
				System.out.println("Ini bukan satu dan dua");
				isLoop = false;
			}
		}
	}

	public void terus() {
		for (int i = 0; i < totalMax; i++) {
			if (i > targetId) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void perulanganJika() {
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public void myArray() {
//		myArray[0] = 1;
//		myArray[1] = 2;
//		myArray[2] = 3;
//		myArray[3] = 4;
//		myArray[4] = 5;
		System.out.println(myArray[0]);
		int panjang = myArray.length;
		System.out.println(panjang);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static void main(String[] args) {
		Pertemuan3 main = new Pertemuan3();
//		main.pilih();
//		main.perulangan();
//		main.ketika();
//		main.lakukan();
//		main.jikaPilih();
//		main.terus();
//		main.perulanganJika();
		main.myArray();
	}

}