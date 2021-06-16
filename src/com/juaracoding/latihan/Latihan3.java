package com.juaracoding.latihan;

public class Latihan3 {

	String nama[] = { "Joseph", "Jane", "Steven" };
	int nilai[] = { 80, 60, 75 };

	public void mahasiswa() {
		for (int i = 0; i < nama.length; i++) {
			System.out.println("Nama Mahasiswa : " + nama[i]);
			System.out.println("Nilai : " + nilai[i]);
			if (nilai[i] >= 80) {
				System.out.println("Grade : A");
			} else if (nilai[i] >= 75 && nilai[i] < 80) {
				System.out.println("Grade : B");
			} else {
				System.out.println("Grade : C");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Latihan3 main = new Latihan3();
		main.mahasiswa();
	}

}
