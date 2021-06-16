package com.juaracoding.latihan;

import java.util.Scanner;

public class Latihan6 {

	int jumlah;
	String data[][] = new String[jumlah][3];

	public void mahasiswa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Mahasiswa = ");
		jumlah = sc.nextInt();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + " = ");
					data[i][j] = sc.next();
				} else if (j == 1) {
					System.out.print("Masukkan NIM ke-" + (i + 1) + " = ");
					data[i][j] = sc.next();
				} else {
					System.out.print("Masukkan Grade ke-" + (i + 1) + " = ");
					data[i][j] = sc.next();
				}
				System.out.println();
			}
		}
//		System.out.print("Jumlah mahasiswa = " + jumlah);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					System.out.print("Nama Mahasiswa ke-" + (i + 1) + " = " + (data[i][j]));
				} else if (j == 1) {
					System.out.print("NIM ke-" + (i + 1) + " = " + (data[i][j]));
				} else {
					System.out.print("Grade ke-" + (i + 1) + " = " + (data[i][j]));
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Latihan6 main = new Latihan6();
		main.mahasiswa();
	}

}
