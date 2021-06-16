package com.juaracoding.latihan;

public class Latihan1 {

	static int a = 5;
	static int b = 10;
	static float c = 5.99f;
	static char d = 'D';
	static boolean e = true;
	static String f = "Hello";
	static float pi = 22.0f / 7.0f;
	static double doublePi = 22.0f / 7.0f;
	int waktu = 17;

	public void angka() {
		if (a < b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public void waktu() {
		if (waktu < 18) {
			System.out.println("Good day");
		} else {
			System.out.println("Bye");
		}
	}

	public static void main(String[] args) {
		Latihan1 main = new Latihan1();
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		main.angka();
		System.out.println(pi);
		System.out.println(doublePi);
		main.waktu();
	}

}
