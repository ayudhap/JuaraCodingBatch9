package com.juaracoding.main;

//Java Fundamental
public class Pertemuan1 {

	int angka1 = 2147483647;
	float angka2 = 10.0f;
	double angka3 = 11.2;
	long angka4 = 922337203;

	char huruf1 = 'A';
	String huruf2 = "AB";

	boolean logika1 = true;
	boolean logika2 = false;

	Integer angka5 = 2147483647;
	Float angka6 = 10.0f;
	Double angka7 = 11.2;
	Long angka8;

	public float pi() {
		float pi = 22.0f / 7.0f;
		return pi;
	}

	public double doublePi() {
		double pi = 22.0f / 7.0f;
		return pi;
	}

	public static void main(String[] args) {
		Pertemuan1 main = new Pertemuan1();
		System.out.println("Bilangan float " + String.valueOf(main.pi()));
		System.out.println("Bilangan double " + String.valueOf(main.doublePi()));
	}

}
