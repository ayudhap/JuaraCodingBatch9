package com.juaracoding.main;

//Java Fundamental
public class Pertemuan2 {

	static int count = 0;
	static boolean kondisi = false;
	static int a = 1;
	static int b = 2;
	static int c = 3;
	String d = "kunci";

	public Pertemuan2() {
		count++;
		System.out.println(count);
	}

	public static void kondisi() {
		if (kondisi) {
			System.out.println("Data masuk");
		}
	}

	public static void print() {
		System.out.println("Kosong");
	}

	public void angka() {
		if (a < b) {
			System.out.println("Benar");
		} else {
			System.out.println("Salah");
		}

	}

	public void angka1() {
		if (2 == b) {
			System.out.println("Nilai b sama dengan 2");
		} else if (a != b) {
			System.out.println("Nilai a tidak sama dengan b");
		}
	}

	public void kata() {
		if (d.equalsIgnoreCase("KUNCI")) {
			System.out.println("Kata kunci sama");
		} else {
			System.out.println("Kata kunci tidak sama");
		}
	}

	public static void main(String[] args) {
		kondisi();
		print();
		Pertemuan2 main = new Pertemuan2(); // Objek pertama +1 count = 1
		Pertemuan2 main1 = new Pertemuan2(); // Objek kedua +1 count = 2
		Pertemuan2 main2 = new Pertemuan2(); // Objek ketiga +1 count = 3
		System.out.println(a + b * c);
		main.angka();
		main.angka1();
		main.kata();
	}

}
